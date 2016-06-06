/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.impl;

import cone.sql.ConectaBD;
import dto.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.dao.EmpleadoDao;

/**
 *
 * @author sistemas
 */
public class EmpleadoDaoImpl implements EmpleadoDao{
public ConectaBD db;
    public EmpleadoDaoImpl() {
        db= new ConectaBD();
    }

    @Override
    public List<Empleado> list() {
    List<Empleado>     list = null;
    String sql = "select * from empleados";
        try {
            Connection cn = db.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            list = new ArrayList<Empleado>();
            while (rs.next()) {                
                Empleado c = new Empleado();
                c.setIdEmpleado(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDireccion(rs.getString(4));
                 c.setTelefono(rs.getString(5));
                   c.setFecha(rs.getString(6));
                    c.setPuesto(rs.getString(7));
                 
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return  list;
    }

    @Override
    public String insert(Empleado empleados) {
       String result= null;
       String sql="Insert into empleados (idempleado, nombre, apellidos, direccion, telefono, fecha, puesto)"
               + " values (?,?,?,?,?,?,?)";
        try {
            Connection cn= db.getConnection();
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setInt(1, empleados.getIdEmpleado());
            ps.setString(2, empleados.getNombre());
            ps.setString(3, empleados.getApellidos());
            ps.setString(4, empleados.getDireccion());
             ps.setString(5, empleados.getTelefono());
              ps.setString(6, empleados.getFecha());
              ps.setString(7, empleados.getPuesto());
            ps.executeUpdate();            
            ps.close();cn.close();
            
        } catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
            result = e.getMessage();
        }
        return  result;
    }

    @Override
    public Integer idEmpleado() {
        Integer id = 0;
        String sql = "select max(idempleado) + 1 as codigo from empleados;";
        try {
            Connection cn= db.getConnection();
            PreparedStatement ps=cn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                id= rs.getInt(1);
            }
            ps.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return  id;
    }

    @Override
    public Empleado get(Integer id) {
        Empleado empleados = null;
        String sql="select * from empleados where idempleado=?";
        try {
            Connection cn= db.getConnection();
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            empleados= new Empleado();
            if(rs.next()){
                empleados.setIdEmpleado(rs.getInt(1));
                empleados.setNombre(rs.getString(2));
                empleados.setApellidos(rs.getString(3));
                
                empleados.setDireccion(rs.getString(4));
                empleados.setTelefono(rs.getString(5));
                empleados.setFecha(rs.getString(6));
                empleados.setPuesto(rs.getString(7));
            }
            cn.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return  empleados;
    }

    @Override
    public String delete(Integer id) {
        String result= null;
        String sql= "delete from empleados where idempleado=?";
        try {
            Connection cn= db.getConnection();
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            cn.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            result = e.getMessage();
        }
        return  result;
    }

    @Override
    public String update(Empleado empleados) {
        String result= null;
        String sql ="update empleados set nombre=?, apellidos =?,"
                + " direccion=?, telefono=?, fecha=?, puesto=? "
                + " where idempleado =?";
        try {
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
           ps.setInt(1, empleados.getIdEmpleado());

            ps.setString(2, empleados.getNombre());
            ps.setString(3, empleados.getApellidos());
            
            ps.setString(4, empleados.getDireccion());
            ps.setString(5, empleados.getTelefono());
            ps.setString(6, empleados.getFecha());
            ps.setString(7, empleados.getPuesto());

           
            ps.executeUpdate();
            cn.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return  result;
    }
    
}

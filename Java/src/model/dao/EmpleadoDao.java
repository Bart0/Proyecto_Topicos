/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import dto.Empleado;
import java.util.List;


public interface EmpleadoDao {
    
    public List<Empleado> list();
    
    public String insert(Empleado empleados);
    
    public Integer idEmpleado();
    
    public Empleado get(Integer id);
    
    public String delete(Integer id);
    
    public String update(Empleado empleados);
}

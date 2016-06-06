
package negocio;

import dto.Empleado;
import java.util.List;
import model.dao.EmpleadoDao;
import model.dao.impl.EmpleadoDaoImpl;


public class EmpleadoNE {
    EmpleadoDao empleadoDao;

    public EmpleadoNE() {
    empleadoDao = new EmpleadoDaoImpl();
    }
    public List<Empleado> list(){
        return empleadoDao.list();
    }
    public String insertarEmpleado(Empleado empleados){
        return empleadoDao.insert(empleados);
    }
    public Integer idEmpleado(){
        return empleadoDao.idEmpleado();
    }
    public Empleado get(Integer id){
        return empleadoDao.get(id);
    }
    public String detele(Integer id){
        return empleadoDao.delete(id);
    }
    public String update(Empleado empleados){
     return empleadoDao.update(empleados);
    }
    
}

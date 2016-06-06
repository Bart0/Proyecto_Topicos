
package dto;


public class Empleado {
  private Integer idempleado ;
  private String nombre ;
  private String apellidos ;
 
  private String direccion ;
  private String telefono ;
  private String fecha ;
  private String puesto ;
  private String sueldo ;
  

    public Empleado() {
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

        public Integer getIdEmpleado() {
        return idempleado;
    }

    public void setIdEmpleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto= puesto;
    }
    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
  
  
}

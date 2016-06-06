
package arduinoswitch;

import dto.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.EmpleadoNE;


public class Consulta_Empleados extends javax.swing.JFrame {

  public EmpleadoNE empleadoNE;
  public List<Empleado> lista;
  public Empleado empleados;
  DefaultTableModel modelo;
  public boolean opcion = false;
    public Consulta_Empleados() {
        empleadoNE = new EmpleadoNE();
        lista= new ArrayList<Empleado>();
        initComponents();
        cargarEmpleado();
        //buscarCliente(1);
    }

   public final void cargarEmpleado(){
        String [] titulos ={"Codigo", "Nombre", "Apellidos", "Direccion", "telefono", "fecha","puesto"};
        modelo = new DefaultTableModel(null, titulos);
        
   String [] fila = new String[7];
   lista = empleadoNE.list();
   for(Empleado c:lista){
       fila[0] = String.valueOf(c.getIdEmpleado());
       fila[1] = c.getNombre();
       fila[2] = c.getApellidos();
       fila[3] = c.getDireccion();
       fila[4] = c.getTelefono();
       fila[5] = c.getFecha();
       fila[6] = c.getPuesto();
     
       
}
  
}
    
    public void asignarEntradas(){
      empleados= new Empleado();
      empleados.setIdEmpleado(Integer.parseInt(lblIdCliente.getText()));
        empleados.setNombre(lbl.getText());
        empleados.setApellidos(lblapellido.getText());
          empleados.setDireccion(lblciudad.getText());
        empleados.setTelefono(lbldir.getText());
        empleados.setFecha(lblcapital.getText());
       ;empleados.setPuesto(lblpuesto.getText());
    }
   
     
    public void buscarCliente(Integer id){
        empleados = empleadoNE.get(id);
        if(empleados.getIdEmpleado()!=null){
            lblIdCliente.setText(String.valueOf(empleados.getIdEmpleado()));
            lbl.setText(empleados.getNombre());
            lblapellido.setText(empleados.getApellidos());
             lblciudad.setText(empleados.getDireccion());
            lbldir.setText(empleados.getTelefono());
            lblcapital.setText(empleados.getFecha());
            lblpuesto.setText(empleados.getPuesto());
            
        }else{
            JOptionPane.showMessageDialog(null, "Empleado no encontrado");
        }
    }
    
  
    public void actualizarCliente(){
        asignarEntradas();
        String rpta= empleadoNE.update(empleados);
        if(null !=rpta){
           JOptionPane.showMessageDialog(null, "Error al Actualizar Empleado" + rpta); 
        }else{
            JOptionPane.showMessageDialog(null, "Empleado  Actualizado Ok");
        }
    }
    
    public void limpiarEntradas(){
        lblIdCliente.setText(null);
        lbl.setText(null);
        lblapellido.setText(null);
         lblciudad.setText(null);
        lbldir.setText(null);
        lblcapital.setText(null);
           lblpuesto.setText(null);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        lblIdCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblapellido = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbldir = new javax.swing.JLabel();
        lblcapital = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblpuesto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acceso a Base de datos con Mysql");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        jLabel2.setText("Codigo");

        jButton6.setText("buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lblIdCliente.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Fecha de ingrso");

        jLabel7.setText("Telefono");

        jLabel9.setText("Direccion:");

        jLabel3.setText("Puesto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldir, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblcapital, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(lblpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 211, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblapellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldir)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblciudad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblcapital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpuesto)
                    .addComponent(jLabel3))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 520, 400));
        jPanel2.getAccessibleContext().setAccessibleName("Datos del Empleado");

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTA DE EMPLEADOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese codigo del Empleado"));
        buscarCliente(id);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consulta_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Consulta_Empleados().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcapital;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lbldir;
    private javax.swing.JLabel lblpuesto;
    // End of variables declaration//GEN-END:variables
}


package arduinoswitch;

import dto.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ClienteNE;


public class Consulta_de_Clientes extends javax.swing.JFrame {

  public ClienteNE clienteNE;
  public List<Cliente> lista;
  public Cliente cliente;
  DefaultTableModel modelo;
  public boolean opcion = false;
    public Consulta_de_Clientes() {
        clienteNE = new ClienteNE();
        lista= new ArrayList<Cliente>();
        initComponents();
        cargarCliente();
        //buscarCliente(1);
    }

   public final void cargarCliente(){
        String [] titulos ={"Codigo", "Nombre", "Apellidos", "Ciudad", "Direccion", "Capital"};
        modelo = new DefaultTableModel(null, titulos);
        
   String [] fila = new String[6];
   lista = clienteNE.list();
   for(Cliente c:lista){
       fila[0] = String.valueOf(c.getIdcliente());
       fila[1] = c.getNombre();
       fila[2] = c.getApellidos();
       fila[3] = c.getCiudad();
       fila[4] = c.getDireccion();
       fila[5] = c.getCapital();
     
       
}
  
}
    
    public void asignarEntradas(){
      cliente= new Cliente();
      cliente.setIdcliente(Integer.parseInt(lblIdCliente.getText()));
        cliente.setNombre(lbl.getText());
        cliente.setApellidos(lblapellido.getText());
          cliente.setCiudad(lblciudad.getText());
        cliente.setDireccion(lbldir.getText());
        cliente.setCapital(lblcapital.getText());
       ;
    }
   
     
    public void buscarCliente(Integer id){
        cliente = clienteNE.get(id);
        if(cliente.getIdcliente()!=null){
            lblIdCliente.setText(String.valueOf(cliente.getIdcliente()));
            lbl.setText(cliente.getNombre());
            lblapellido.setText(cliente.getApellidos());
             lblciudad.setText(cliente.getCiudad());
            lbldir.setText(cliente.getDireccion());
            lblcapital.setText(cliente.getCapital());
            
        }else{
            JOptionPane.showMessageDialog(null, "Cliente no encontrado");
        }
    }
    
  
    public void actualizarCliente(){
        asignarEntradas();
        String rpta= clienteNE.update(cliente);
        if(null !=rpta){
           JOptionPane.showMessageDialog(null, "Error al Actualizar Cliente" + rpta); 
        }else{
            JOptionPane.showMessageDialog(null, "Cliente Actualizado Ok");
        }
    }
    
    public void limpiarEntradas(){
        lblIdCliente.setText(null);
        lbl.setText(null);
        lblapellido.setText(null);
         lblciudad.setText(null);
        lbldir.setText(null);
        lblcapital.setText(null);
        
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

        jLabel6.setText("Capital ");

        jLabel7.setText("Ciudad:");

        jLabel9.setText("Direccion:");

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
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(36, 36, 36))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldir, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcapital, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 214, Short.MAX_VALUE))))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblciudad))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcapital)
                    .addComponent(jLabel6))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 510, 360));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setText("MANEJO DE SALDOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Integer id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese codigo del Clienete"));
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
            java.util.logging.Logger.getLogger(Consulta_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_de_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Consulta_de_Clientes().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables
}

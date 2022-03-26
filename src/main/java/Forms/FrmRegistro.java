package Forms;

import Conexiones.ConexionSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class FrmRegistro extends javax.swing.JFrame {

    public FrmRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    ConexionSQL con = new ConexionSQL();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtConfContraseña = new javax.swing.JPasswordField();
        TxtContraseña = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 94, 92));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        BtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 119, 44));

        BtnConfirmar.setBackground(new java.awt.Color(86, 140, 179));
        BtnConfirmar.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirmar.setText("CONFIRMAR");
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 115, 44));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        TxtConfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtConfContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtConfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 252, 30));

        TxtContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(51, 51, 51)));
        TxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 252, 27));

        jPanel2.setBackground(new java.awt.Color(124, 168, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 75, 29));

        TxtUsuario.setToolTipText("");
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 252, 29));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 60, -1));

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 252, 29));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        TxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 252, 29));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 252, 29));

        TxtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 252, 29));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTelefonoActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        ConfirmarRegistro();
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void TxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellidoActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtContraseñaActionPerformed

    private void TxtConfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtConfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtConfContraseñaActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        new FrmLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JPasswordField TxtConfContraseña;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void ConfirmarRegistro() {

        String usuario = TxtUsuario.getText();
        String nombre = TxtNombre.getText();
        String apellido = TxtApellido.getText();
        String correo = TxtCorreo.getText();
        String contraseña = TxtContraseña.getText();
        String confirmarContraseña = TxtConfContraseña.getText();
        String telefono = TxtTelefono.getText();

        if (usuario.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || confirmarContraseña.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");

        } else {

            if (contraseña.equals(confirmarContraseña)) {

                try {

                    Connection cnn = con.getConexion();

                    PreparedStatement ps = cnn.prepareStatement("INSERT INTO Usuarios (usuario, nombre, apellido, correo, contraseña, telefono)  values ( ?, ?, ?, ?, ?, ? );");
                    ps.setString(1, this.TxtUsuario.getText());
                    ps.setString(2, this.TxtNombre.getText());
                    ps.setString(3, this.TxtApellido.getText());
                    ps.setString(4, this.TxtCorreo.getText());
                    ps.setString(5, this.TxtContraseña.getText());
                    ps.setString(6, this.TxtTelefono.getText());
                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Registro completado exitosamente");
                    new FrmLogin().setVisible(true);
                    this.dispose();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, "Error, no pudo registrarse");
                    JOptionPane.showMessageDialog(null, e);

                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                //new FrmRegistro().setVisible(true);
                //this.dispose();
            }

        }
    }

}

package Forms;

import javax.swing.JOptionPane;
import java.sql.*;
import Conexiones.ConexionSQL;

public class FrmLogin extends javax.swing.JFrame {

    ConexionSQL con = new ConexionSQL();

    public FrmLogin() {

        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtUser = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();
        BtnRegistrarse = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(123, 150, 232));
        jPanel1.setMaximumSize(new java.awt.Dimension(362, 409));
        jPanel1.setMinimumSize(new java.awt.Dimension(362, 409));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 194, 28));

        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 194, 29));

        BtnLogin.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        BtnLogin.setText("Login");
        BtnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 194, 40));

        BtnRegistrarse.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 11)); // NOI18N
        BtnRegistrarse.setText("Registrarse");
        BtnRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 194, 39));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 370, 20));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 370, 20));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 64, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 92, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 440));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 20));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed

        String user = TxtUser.getText();
        String password = TxtPassword.getText();

        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar ambos campos");
        } else {
            try {

                Connection cnn = con.getConexion();

                PreparedStatement ps = cnn.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? and contraseña = ? ");
                ps.setObject(1, this.TxtUser.getText());
                ps.setObject(2, this.TxtPassword.getText());

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Bienvenido");
                    new FrmMant().setVisible(true);
                    this.dispose();

                } else {

                    System.out.println("Error de Login");
                    JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error de verificación");
            }

        }

    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed

        FrmRegistro registro = new FrmRegistro();
        registro.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}

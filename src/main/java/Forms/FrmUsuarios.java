package Forms;

import Conexiones.ConexionSQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmUsuarios extends javax.swing.JFrame {

    public FrmUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        TxtUsuario = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtContraseña = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Apellido", "Correo", "Contraseña", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblUsuarios);
        if (TblUsuarios.getColumnModel().getColumnCount() > 0) {
            TblUsuarios.getColumnModel().getColumn(0).setResizable(false);
            TblUsuarios.getColumnModel().getColumn(1).setResizable(false);
            TblUsuarios.getColumnModel().getColumn(2).setResizable(false);
            TblUsuarios.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setText("Usuarios");

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnAtras.setText("Atrás");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("CORREO");

        jLabel6.setText("CONTRASEÑA");

        jLabel7.setText("TELEFONO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtContraseña)
                                    .addComponent(TxtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEliminar))
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtras)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        new FrmMant().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        EditarUsuarios();
        cargarTabla();
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        Eliminar();
        cargarTabla();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void TblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblUsuariosMouseClicked
      try {

            int fila = TblUsuarios.getSelectedRow();
            String usuario = (TblUsuarios.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = ConexionSQL.getConexion();
            ps = con.prepareStatement("SELECT usuario, nombre, apellido, correo, contraseña, telefono From Usuarios where usuario = ?");
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            while (rs.next()) {

                TxtUsuario.setText(String.valueOf(usuario));
                TxtNombre.setText(rs.getString("nombre"));
                TxtApellido.setText(rs.getString("apellido"));
                TxtCorreo.setText(rs.getString("correo"));
                TxtContraseña.setText(rs.getString("contraseña"));
                TxtTelefono.setText(rs.getString("telefono"));
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_TblUsuariosMouseClicked

    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) TblUsuarios.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = ConexionSQL.getConexion();
            ps = con.prepareStatement("SELECT * From Usuarios");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {

                Object[] fila = new Object[columnas];

                for (int index = 0; index < columnas; index++) {
                    fila[index] = rs.getObject(index + 1);
                }

                modeloTabla.addRow(fila);

            }

        } catch (SQLException e) {

        }

    }

    public void EditarUsuarios() {

        String usuario = TxtUsuario.getText();
        String nombre = TxtNombre.getText();
        String apellido = TxtApellido.getText();
        String correo = TxtCorreo.getText();
        String contraseña = TxtContraseña.getText();
        String telefono = TxtTelefono.getText();

        if (usuario.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || contraseña.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");

        } else {

            try {

                Connection cnn = ConexionSQL.getConexion();

                PreparedStatement ps = cnn.prepareStatement("Update Usuarios Set usuario = ?, nombre = ?, apellido = ?, correo = ?, contraseña = ?, telefono = ?  WHERE usuario = ?");
                ps.setString(1, this.TxtUsuario.getText());
                ps.setString(2, this.TxtNombre.getText());
                ps.setString(3, this.TxtApellido.getText());
                ps.setString(4, this.TxtCorreo.getText());
                ps.setString(5, this.TxtContraseña.getText());
                ps.setString(6, this.TxtTelefono.getText());
                ps.setString(7, usuario);
                ps.executeUpdate();
                Limpiar();

                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente");
                cargarTabla();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Error, no pudo editar el registro");
                JOptionPane.showMessageDialog(null, e);

            }

        }

    }

    private void Limpiar() {

        TxtUsuario.setText("");
        TxtNombre.setText("");
        TxtApellido.setText("");
        TxtCorreo.setText("");
        TxtContraseña.setText("");
        TxtTelefono.setText("");

    }

    private void Eliminar() {
        String usuario = TxtUsuario.getText();

        try {

            Connection cnn = ConexionSQL.getConexion();

            PreparedStatement ps = cnn.prepareStatement("DELETE FROM Usuarios WHERE usuario = ? ");
            ps.setString(1, usuario);
            ps.executeUpdate();
            Limpiar();

            JOptionPane.showMessageDialog(null, "Registro Eliminado");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error, no pudo Eliminar el Usuario");
            JOptionPane.showMessageDialog(null, e);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JTable TblUsuarios;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtContraseña;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

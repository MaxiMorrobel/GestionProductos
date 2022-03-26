package Forms;

import Conexiones.ConexionSQL;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmProductos extends javax.swing.JFrame {

    public FrmProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtCategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Marca", "Categoria", "Precio RD$", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblProductos);
        if (TblProductos.getColumnModel().getColumnCount() > 0) {
            TblProductos.getColumnModel().getColumn(0).setResizable(false);
            TblProductos.getColumnModel().getColumn(1).setResizable(false);
            TblProductos.getColumnModel().getColumn(2).setResizable(false);
            TblProductos.getColumnModel().getColumn(4).setResizable(false);
            TblProductos.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setText("Productos");

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

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

        jLabel2.setText("NOMBRE");

        jLabel3.setText("MARCA");

        jLabel4.setText("CATEGORÍA");

        jLabel5.setText("PRECIO");

        jLabel6.setText("CANTIDAD");

        jLabel7.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCategoria)
                                    .addComponent(TxtPrecio)
                                    .addComponent(TxtCantidad)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TxtProducto, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAgregar)
                            .addComponent(BtnEliminar)
                            .addComponent(BtnEditar))
                        .addGap(18, 18, 18)
                        .addComponent(BtnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        new FrmMant().setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        EditarProductos();
        cargarTabla();

    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        ConfirmarProductos();
        cargarTabla();

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void TblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProductosMouseClicked

        try {

            int fila = TblProductos.getSelectedRow();
            String id = (TblProductos.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = ConexionSQL.getConexion();
            ps = con.prepareStatement("SELECT id, nombre, marca, categoria, precio, cantidad From Productos where id = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                TxtId.setText(String.valueOf(id));
                TxtProducto.setText(rs.getString("nombre"));
                TxtMarca.setText(rs.getString("marca"));
                TxtCategoria.setText(rs.getString("categoria"));
                TxtPrecio.setText(rs.getString("precio"));
                TxtCantidad.setText(rs.getString("cantidad"));
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_TblProductosMouseClicked

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        Eliminar();
        cargarTabla();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) TblProductos.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {

            Connection con = ConexionSQL.getConexion();
            ps = con.prepareStatement("SELECT * From Productos");

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

    private void Limpiar() {

        TxtId.setText("");
        TxtProducto.setText("");
        TxtMarca.setText("");
        TxtCategoria.setText("");
        TxtPrecio.setText("");
        TxtCantidad.setText("");

    }

    public void ConfirmarProductos() {

        String id = TxtId.getText();
        String producto = TxtProducto.getText();
        String marca = TxtMarca.getText();
        String categoria = TxtCategoria.getText();
        String precio = TxtPrecio.getText();
        String cantidad = TxtCantidad.getText();

        if (id.isEmpty() || producto.isEmpty() || marca.isEmpty() || categoria.isEmpty() || precio.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");

        } else {

            try {

                Connection cnn = ConexionSQL.getConexion();

                PreparedStatement ps = cnn.prepareStatement("INSERT INTO Productos (id, nombre, marca, categoria, precio, cantidad)  values ( ?, ?, ?, ?, ?, ? );");
                ps.setString(1, this.TxtId.getText());
                ps.setString(2, this.TxtProducto.getText());
                ps.setString(3, this.TxtMarca.getText());
                ps.setString(4, this.TxtCategoria.getText());
                ps.setString(5, this.TxtPrecio.getText());
                ps.setString(6, this.TxtCantidad.getText());
                ps.executeUpdate();
                Limpiar();

                JOptionPane.showMessageDialog(null, "Registro Completado Exitosamente");
                

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Error, no pudo registrar el producto");
                JOptionPane.showMessageDialog(null, e);

            }

        }

    }
    
    private void Eliminar(){
        
        String id = TxtId.getText();

            try {

                Connection cnn = ConexionSQL.getConexion();

                PreparedStatement ps = cnn.prepareStatement("DELETE FROM Productos WHERE id = ? ");
                ps.setString(1, id);
                ps.executeUpdate();
                Limpiar();

                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Error, no pudo Eliminar el Producto");
                JOptionPane.showMessageDialog(null, e);

            }        
    
    }

    public void EditarProductos() {

        String id = TxtId.getText();
        String producto = TxtProducto.getText();
        String marca = TxtMarca.getText();
        String categoria = TxtCategoria.getText();
        String precio = TxtPrecio.getText();
        String cantidad = TxtCantidad.getText();

        if (id.isEmpty() || producto.isEmpty() || marca.isEmpty() || categoria.isEmpty() || precio.isEmpty() || cantidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");

        } else {

            try {

                Connection cnn = ConexionSQL.getConexion();

                PreparedStatement ps = cnn.prepareStatement("Update Productos Set id = ?, nombre = ?, marca = ?, categoria = ?, precio = ?, cantidad = ?  WHERE id = ?");
                ps.setString(1, this.TxtId.getText());
                ps.setString(2, this.TxtProducto.getText());
                ps.setString(3, this.TxtMarca.getText());
                ps.setString(4, this.TxtCategoria.getText());
                ps.setString(5, this.TxtPrecio.getText());
                ps.setString(6, this.TxtCantidad.getText());
                ps.setString(7, id);
                ps.executeUpdate();
                Limpiar();

                JOptionPane.showMessageDialog(null, "Registro modificado exitosamente");
                cargarTabla();

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Error, no pudo registrarse");
                JOptionPane.showMessageDialog(null, e);

            }

        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JTable TblProductos;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtProducto;
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

package Conexiones;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionSQL {

    public static Connection getConexion() {

        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=Almacen;"
                + "user=usuarioSQL;"
                + "password=1234;"
                + "LoginTimeout=30;";
        try {

            Connection cn;
            cn = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null, "Conexión con la base de datos exitosa");
            return cn;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

            return null;
        }
    }
}

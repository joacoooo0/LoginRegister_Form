package com.loginregister.test;

import com.loginregister.conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestConexion {

    public void TestConexion() {
        Connection connection = null;
        try {
            connection = Conexion.getConnection();
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Conexión completa");
            } else {
                JOptionPane.showMessageDialog(null, "Conexión fallida");
            }
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
;
}

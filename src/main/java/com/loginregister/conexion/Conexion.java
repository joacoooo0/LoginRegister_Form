package com.loginregister.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static final String url = "jdbc:mysql://127.0.0.1:3306/LoginRegister";
    public static final String user = "root";
    public static final String pass = "qle6vzZhgnBqfCINGXjG";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}

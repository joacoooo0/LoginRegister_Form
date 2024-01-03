package com.loginregister.model;

import com.loginregister.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class ModelUser {

    public int idUser;
    public String nombreUser;
    public String apellidoUser;
    public String correoUser;
    public String passUser;
    public Date fechaRegUser;
    public int idTipoUser;

    public ModelUser() {
    }

    public ModelUser(int idUser, String nombreUser, String apellidoUser, String correoUser, String passUser, Date fechaRegUser, int idTipoUser) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.apellidoUser = apellidoUser;
        this.correoUser = correoUser;
        this.passUser = passUser;
        this.fechaRegUser = fechaRegUser;
        this.idTipoUser = idTipoUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getApellidoUser() {
        return apellidoUser;
    }

    public void setApellidoUser(String apellidoUser) {
        this.apellidoUser = apellidoUser;
    }

    public String getCorreoUser() {
        return correoUser;
    }

    public void setCorreoUser(String correoUser) {
        this.correoUser = correoUser;
    }

    public String getPassUser() {
        return passUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public Date getFechaRegUser() {
        return fechaRegUser;
    }

    public void setFechaRegUser(Date fechaRegUser) {
        this.fechaRegUser = fechaRegUser;
    }

    public int getIdTipoUser() {
        return idTipoUser;
    }

    public void setIdTipoUser(int idTipoUser) {
        this.idTipoUser = idTipoUser;
    }

    public void AgregarUsuario(String nombreUser, String apellidoUser, String correoUser, String passUser, Date fechaRegUser, int idTipoUser) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO USUARIOS (nombre, apellido, correo, pass, fechareg, idTipo) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            connection = Conexion.getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, nombreUser);
            ps.setString(2, apellidoUser);
            ps.setString(3, correoUser);
            ps.setString(4, passUser);
            ps.setDate(5, new java.sql.Date (fechaRegUser.getTime()));
            ps.setInt(6, idTipoUser);

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el usuario");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void ValidarUsuario(String correoUser, String passUser) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String queryValidacion = "SELECT * FROM USUARIOS WHERE correo = ? AND pass = ?";

        try {
            connection = Conexion.getConnection();
            ps = connection.prepareStatement(queryValidacion);
            ps.setString(1, getCorreoUser());
            ps.setString(2, getPassUser());
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Credenciales correctas");
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}

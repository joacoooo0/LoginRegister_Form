package com.loginregister.controller;

import com.loginregister.model.ModelUser;
import com.loginregister.view.V_Register;

import java.sql.SQLException;
import java.util.Date;

public class ControllerUser {

    private final ModelUser modelUser;

    public ControllerUser() {
        this.modelUser = new ModelUser();
    }

    public void registrarUsuario(V_Register registroView) {
        String nombre = registroView.getNombre();
        String apellido = registroView.getApellido();
        String correo = registroView.getCorreo();
        String contraseña = registroView.getPass();
        Date fecha = registroView.getFecha();
        int idTipoUsuario = Integer.parseInt(registroView.getRol()); // Ajusta esto según tus necesidades

        try {
            modelUser.AgregarUsuario(nombre, apellido, correo, contraseña, fecha, idTipoUsuario);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

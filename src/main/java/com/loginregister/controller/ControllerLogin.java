package com.loginregister.controller;

import com.loginregister.model.ModelUser;
import com.loginregister.view.V_Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerLogin {

    private final ModelUser modelUser;

    public ControllerLogin() {
        this.modelUser = new ModelUser();
    }
    
    public void ValidarUsuario(V_Login login){
        String correo = login.getCorreo();
        String pass = login.getPass();
        
        try {
            modelUser.ValidarUsuario(correo, pass);
            login.LimpiarCamposLogin();
        } catch (SQLException ex) {
            Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

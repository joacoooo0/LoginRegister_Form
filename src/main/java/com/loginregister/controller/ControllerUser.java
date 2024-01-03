package com.loginregister.controller;

import com.loginregister.model.ModelUser;
import com.loginregister.view.V_Register;
import java.util.Date;

public class ControllerUser{

    ModelUser modeluser;
    V_Register register;

    public void AgregarUsuario(String nombreUser, String apellidoUser, String correoUser, String passUser, Date fechaRegUser, int idTipoUser) {
        modeluser.setNombreUser(nombreUser);
        modeluser.setApellidoUser(apellidoUser);
        modeluser.setCorreoUser(correoUser);
        modeluser.setPassUser(passUser);
        modeluser.setFechaRegUser(fechaRegUser);
        modeluser.setIdTipoUser(idTipoUser);
    }
}

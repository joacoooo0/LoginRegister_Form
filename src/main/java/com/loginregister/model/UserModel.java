package com.loginregister.model;

import java.util.Date;

public class UserModel {

    public int idUser;
    public String nombreUser;
    public String apellidoUser;
    public String correoUser;
    public String passUser;
    public Date fechaRegUser;
    public int idTipoUser;

    public UserModel() {
    }

    public UserModel(int idUser, String nombreUser, String apellidoUser, String correoUser, String passUser, Date fechaRegUser, int idTipoUser) {
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

    public void AgregarUsuario(){
        
    }
    
}

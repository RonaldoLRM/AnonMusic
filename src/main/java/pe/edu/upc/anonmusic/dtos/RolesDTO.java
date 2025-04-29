package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Usuarios;

public class RolesDTO {
    private int idRol;

    private String rol;

    private Usuarios usuario;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}

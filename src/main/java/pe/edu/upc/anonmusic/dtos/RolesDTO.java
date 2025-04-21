package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Usuarios;

public class RolesDTO {
    private int idRol;

    private String tipo;

    private Usuarios usuario;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}

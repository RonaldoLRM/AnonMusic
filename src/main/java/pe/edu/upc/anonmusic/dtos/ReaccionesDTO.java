package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Publicaciones;

public class ReaccionesDTO {
    private int idReacciones;
    private int idusuario;
    private Boolean tipo;
    private Publicaciones publicaciones;

    public int getIdReacciones() {
        return idReacciones;
    }

    public void setIdReacciones(int idReacciones) {
        this.idReacciones = idReacciones;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
    }
}

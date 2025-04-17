package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Publicaciones;

public class ComentariosDTO {
    private int idComentario;
    private int idusuArio;
    private String contenido;
    private Publicaciones publicaciones;

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getIdusuArio() {
        return idusuArio;
    }

    public void setIdusuArio(int idusuArio) {
        this.idusuArio = idusuArio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
    }
}

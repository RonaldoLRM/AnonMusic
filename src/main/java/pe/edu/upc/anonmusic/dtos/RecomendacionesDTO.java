package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.PlaylistsXUsuario;

public class RecomendacionesDTO {
    private int idRecomendacion;
    private String contenido;
    private String razon;
    private boolean vista;
    private PlaylistsXUsuario playlistxUsuario;

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public PlaylistsXUsuario getPlaylistxUsuario() {
        return playlistxUsuario;
    }

    public void setPlaylistxUsuario(PlaylistsXUsuario playlistxUsuario) {
        this.playlistxUsuario = playlistxUsuario;
    }
}

package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Usuarios;

public class PlaylistsXUsuarioDTO {
    private int idPlaylistsXUsuario;
    private String archivo;
    private String nombre;
    private Usuarios usuarios;

    public int getIdPlaylistsXUsuario() {
        return idPlaylistsXUsuario;
    }

    public void setIdPlaylistsXUsuario(int idPlaylistsXUsuario) {
        this.idPlaylistsXUsuario = idPlaylistsXUsuario;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}

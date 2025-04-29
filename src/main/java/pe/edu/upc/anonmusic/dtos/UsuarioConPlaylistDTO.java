package pe.edu.upc.anonmusic.dtos;

public class UsuarioConPlaylistDTO {
    private int idUsuario;
    private String nombre;
    public int CantidadPlaylist;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCantidadPlaylist() {
        return CantidadPlaylist;
    }

    public void setCantidadPlaylist(int cantidadPlaylist) {
        CantidadPlaylist = cantidadPlaylist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

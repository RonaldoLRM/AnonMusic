package pe.edu.upc.anonmusic.dtos;

public class UsuarioConPlaylistDTO {
    private int idUsuario;
    private String nombre;
    public int cantidad_playlist;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_playlist() {
        return cantidad_playlist;
    }

    public void setCantidad_playlist(int cantidad_playlist) {
        this.cantidad_playlist = cantidad_playlist;
    }
}

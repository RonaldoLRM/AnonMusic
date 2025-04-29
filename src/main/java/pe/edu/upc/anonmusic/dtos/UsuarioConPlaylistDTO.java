package pe.edu.upc.anonmusic.dtos;

public class UsuarioConPlaylistDTO {
    private int idUsuario;
    private String username;
    public int cantidad_playlist;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCantidad_playlist() {
        return cantidad_playlist;
    }

    public void setCantidad_playlist(int cantidad_playlist) {
        this.cantidad_playlist = cantidad_playlist;
    }
}

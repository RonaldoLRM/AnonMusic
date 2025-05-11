package pe.edu.upc.anonmusic.dtos;

public class UsuariosConMasNotificacionesNoLeidasDTO {
    private int idUsuario;
    private String username;
    private int total_notificaciones_no_leidas;

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

    public int getTotal_notificaciones_no_leidas() {
        return total_notificaciones_no_leidas;
    }

    public void setTotal_notificaciones_no_leidas(int total_notificaciones_no_leidas) {
        this.total_notificaciones_no_leidas = total_notificaciones_no_leidas;
    }
}

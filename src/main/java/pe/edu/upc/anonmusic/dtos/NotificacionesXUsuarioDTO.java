package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Notificaciones;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;

public class NotificacionesXUsuarioDTO {

    private int idNotificacionesxUsuario;
    private Boolean visto;
    private LocalDate fecha;
    private Usuarios usuarios;
    private Notificaciones notificaciones;

    public int getIdNotificacionesxUsuario() {
        return idNotificacionesxUsuario;
    }

    public void setIdNotificacionesxUsuario(int idNotificacionesxUsuario) {
        this.idNotificacionesxUsuario = idNotificacionesxUsuario;
    }

    public Boolean getVisto() {
        return visto;
    }

    public void setVisto(Boolean visto) {
        this.visto = visto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Notificaciones getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(Notificaciones notificaciones) {
        this.notificaciones = notificaciones;
    }
}

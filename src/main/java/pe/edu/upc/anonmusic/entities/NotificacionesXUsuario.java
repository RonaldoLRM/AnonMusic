package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="NotificacionesXUsuario")
public class NotificacionesXUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacionesxUsuario;

    @Column(name = "visto", nullable = false)
    private Boolean visto;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name="idNotificaciones")
    private Notificaciones notificaciones;

    public NotificacionesXUsuario() {
    }

    public NotificacionesXUsuario(int idNotificacionesxUsuario, Boolean visto, LocalDate fecha, Usuarios usuarios, Notificaciones notificaciones) {
        this.idNotificacionesxUsuario = idNotificacionesxUsuario;
        this.visto = visto;
        this.fecha = fecha;
        this.usuarios = usuarios;
        this.notificaciones = notificaciones;
    }

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

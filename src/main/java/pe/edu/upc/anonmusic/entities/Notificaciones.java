package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Notificaciones")
public class Notificaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;

    @Column(name="tipoNotificacion", nullable=false, length=30)
    private String tipoNotificacion;

    @Column(name="MensajeNotificacion", nullable=false, length=200)
    private String MensajeNotificacion;

    public Notificaciones() {
    }

    public Notificaciones(int idNotificacion, String tipoNotificacion, String mensajeNotificacion) {
        this.idNotificacion = idNotificacion;
        this.tipoNotificacion = tipoNotificacion;
        MensajeNotificacion = mensajeNotificacion;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getMensajeNotificacion() {
        return MensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        MensajeNotificacion = mensajeNotificacion;
    }
}

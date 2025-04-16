package pe.edu.upc.anonmusic.dtos;

public class NotificacionesDTO {
    private int idNotificacion;

    private String tipoNotificacion;

    private String MensajeNotificacion;

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

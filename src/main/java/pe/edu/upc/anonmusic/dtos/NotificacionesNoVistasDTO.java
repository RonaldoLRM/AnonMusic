package pe.edu.upc.anonmusic.dtos;

public class NotificacionesNoVistasDTO {
    private String tipoNotificacion;
    private int cantidadNotificacionesNoVistas;

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public int getCantidadNotificacionesNoVistas() {
        return cantidadNotificacionesNoVistas;
    }

    public void setCantidadNotificacionesNoVistas(int cantidadNotificacionesNoVistas) {
        this.cantidadNotificacionesNoVistas = cantidadNotificacionesNoVistas;
    }
}

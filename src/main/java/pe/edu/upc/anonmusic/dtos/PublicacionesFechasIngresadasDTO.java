package pe.edu.upc.anonmusic.dtos;

import java.time.LocalDate;

public class PublicacionesFechasIngresadasDTO {
    private LocalDate fechaPublicacion;
    private int cantidadPublicacion;

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getCantidadPublicacion() {
        return cantidadPublicacion;
    }

    public void setCantidadPublicacion(int cantidadPublicacion) {
        this.cantidadPublicacion = cantidadPublicacion;
    }
}

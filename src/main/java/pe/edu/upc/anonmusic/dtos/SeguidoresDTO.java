package pe.edu.upc.anonmusic.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;

public class SeguidoresDTO {
    private int idSeguidores;
    private LocalDate fecha;
    private int cantidad;
    private Usuarios usuario;

    public int getIdSeguidores() {
        return idSeguidores;
    }

    public void setIdSeguidores(int idSeguidores) {
        this.idSeguidores = idSeguidores;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
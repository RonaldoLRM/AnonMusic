package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;

public class SeguidosDTO {
    private int idSeguidos;

    private LocalDate fecha;

    private int cantidad;

    private Usuarios usuario;

    public int getIdSeguidos() {
        return idSeguidos;
    }

    public void setIdSeguidos(int idSeguidos) {
        this.idSeguidos = idSeguidos;
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
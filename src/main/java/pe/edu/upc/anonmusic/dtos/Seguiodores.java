package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;

public class Seguiodores {

    private int idSeguidores;

    private int cantidad;

    private LocalDate fecha;

    private Usuarios usuario;

    public int getIdReacciones() {return idSeguidores;}

    public void setIdSeguidores(int idSeguidores) {this.idSeguidores = idSeguidores;}

    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public LocalDate getFecha() {return fecha;}

    public void setFecha(LocalDate fecha) {this.fecha = fecha;}

    public Usuarios getUsuario() {return usuario;}

    public void setUsuario(Usuarios usuario) {this.usuario = usuario;}

}

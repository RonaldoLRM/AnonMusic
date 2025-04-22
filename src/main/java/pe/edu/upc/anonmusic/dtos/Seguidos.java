package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Usuarios;

public class Seguidos {
    private int idSeguidos;


    private int cantidad;

    private Usuarios usuario;

    public int getIdSeguidos() {return idSeguidos;}

    public void setIdSeguidos(int idSeguidos) {this.idSeguidos = idSeguidos;}


    public int getCantidad() {return cantidad;}

    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public Usuarios getUsuario() {return usuario;}

    public void setUsuario(Usuarios usuario) {this.usuario = usuario;}
}

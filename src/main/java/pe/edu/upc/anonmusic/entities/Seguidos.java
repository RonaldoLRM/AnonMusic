package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="seguidos")
public class Seguidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSeguidos;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuario;

    public Seguidos() {
    }

    public Seguidos(int idSeguidos, LocalDate fecha, int cantidad, Usuarios usuario) {
        this.idSeguidos = idSeguidos;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.usuario = usuario;
    }

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


package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="seguidores")
public class Seguidores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSeguidores;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuario;

    public Seguidores() {
    }

    public Seguidores(int idSeguidores, LocalDate fecha, int cantidad, Usuarios usuario) {
        this.idSeguidores = idSeguidores;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.usuario = usuario;
    }

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

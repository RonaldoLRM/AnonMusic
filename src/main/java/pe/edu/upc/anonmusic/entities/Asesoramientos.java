package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Asesoramientos")
public class Asesoramientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdAsesoramiento;

    @Column(name = "fechaSolicitud", nullable = false)
    private LocalDate fechaSolicitud;

    @ManyToOne
    @JoinColumn(name = "idMusica")
    private Musica musica;

    @Column(name = "fechaAtendido", nullable = true)
    private LocalDate fechaAtendido;

    @ManyToOne
    @JoinColumn(name = "idUsuario",nullable = true)
    private Usuarios usuario;

    public Asesoramientos() {
    }

    public Asesoramientos(int idAsesoramiento, LocalDate fechaSolicitud, Musica musica, LocalDate fechaAtendido, Usuarios usuario) {
        IdAsesoramiento = idAsesoramiento;
        this.fechaSolicitud = fechaSolicitud;
        this.musica = musica;
        this.fechaAtendido = fechaAtendido;
        this.usuario = usuario;
    }

    public int getIdAsesoramiento() {
        return IdAsesoramiento;
    }

    public void setIdAsesoramiento(int idAsesoramiento) {
        IdAsesoramiento = idAsesoramiento;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public LocalDate getFechaAtendido() {
        return fechaAtendido;
    }

    public void setFechaAtendido(LocalDate fechaAtendido) {
        this.fechaAtendido = fechaAtendido;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}

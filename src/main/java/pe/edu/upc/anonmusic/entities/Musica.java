package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Musica")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMusica;

    @Column(name = "archivo", nullable = false)
    private String archivo;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "privacidad", nullable = false)
    private boolean privacidad;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuario;

    @Column(name = "usado", nullable = false)
    private boolean usado;

    public Musica() {
    }

    public Musica(int idMusica, String archivo, String nombre, LocalDate fecha, boolean privacidad, Usuarios usuario, boolean usado) {
        this.idMusica = idMusica;
        this.archivo = archivo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.privacidad = privacidad;
        this.usuario = usuario;
        this.usado = usado;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}

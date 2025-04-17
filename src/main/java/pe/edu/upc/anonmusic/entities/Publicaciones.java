package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name= "Publicaciones")
public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @Column(name = "tipoPublicacion", nullable = false,length = 50)
    private String tipoPublicacion;

    @Column(name = "fechaPublicacion", nullable = false)
    private LocalDate fechaPublicacion;

    @Column(name = "privacidad", nullable = false)
    private Boolean privacidad;

    @Column(name = "contenido", nullable = true,length = 200)
    private String contenido;

    @Column(name = "archivo", nullable = true,length = 200)
    private String archivo;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuarios usuario;

    public Publicaciones() {
    }

    public Publicaciones(int idPublicacion, String tipoPublicacion, LocalDate fechaPublicacion, Boolean privacidad, String contenido, String archivo, Usuarios usuario) {
        this.idPublicacion = idPublicacion;
        this.tipoPublicacion = tipoPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.privacidad = privacidad;
        this.contenido = contenido;
        this.archivo = archivo;
        this.usuario = usuario;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(String tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Boolean getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(Boolean privacidad) {
        this.privacidad = privacidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}

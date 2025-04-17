package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Comentarios")
public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;

    @Column(name = "idusuArio", nullable = false)
    private int idusuArio;

    @Column(name = "contenido", nullable = false,length = 500)
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicaciones publicaciones;

    public Comentarios() {
    }

    public Comentarios(int idComentario, int idusuArio, String contenido, Publicaciones publicaciones) {
        this.idComentario = idComentario;
        this.idusuArio = idusuArio;
        this.contenido = contenido;
        this.publicaciones = publicaciones;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public int getIdusuArio() {
        return idusuArio;
    }

    public void setIdusuArio(int idusuArio) {
        this.idusuArio = idusuArio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
    }
}

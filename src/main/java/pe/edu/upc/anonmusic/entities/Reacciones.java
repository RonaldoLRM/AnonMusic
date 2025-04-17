package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Reacciones")
public class Reacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReacciones;

    @Column(name = "idusuario", nullable = false)
    private int idusuario;

    @Column(name = "tipo", nullable = false)
    private Boolean tipo;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicaciones publicaciones;

    public Reacciones() {
    }

    public Reacciones(int idReacciones, int idusuario, Boolean tipo, Publicaciones publicaciones) {
        this.idReacciones = idReacciones;
        this.idusuario = idusuario;
        this.tipo = tipo;
        this.publicaciones = publicaciones;
    }

    public int getIdReacciones() {
        return idReacciones;
    }

    public void setIdReacciones(int idReacciones) {
        this.idReacciones = idReacciones;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
    }
}

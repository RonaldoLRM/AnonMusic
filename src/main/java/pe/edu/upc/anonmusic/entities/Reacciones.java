package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Reacciones")
public class Reacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReacciones;

    @Column(name = "tipo", nullable = false)
    private Boolean tipo;

    public Reacciones() {
    }

    public Reacciones(int idReacciones, Boolean tipo) {
        this.idReacciones = idReacciones;
        this.tipo = tipo;
    }

    public int getIdReacciones() {
        return idReacciones;
    }

    public void setIdReacciones(int idReacciones) {
        this.idReacciones = idReacciones;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }
}

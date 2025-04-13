package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Reacciones")
public class Reacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "tipo", nullable = false)
    private Boolean tipo;

    public Reacciones() {
    }

    public Reacciones(int codigo, Boolean tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }
}

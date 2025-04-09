package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Reacciones")
public class Reacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name = "tipo", nullable = false)
    private boolean tipo;

    public Reacciones() {
    }

    public Reacciones(int codigo, boolean tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}

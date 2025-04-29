package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"idUsuario", "rol"})})
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @Column(name = "rol", nullable = false, length = 30)
    private String rol;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuario;

    public Roles() {
    }

    public Roles(int idRol, String rol, Usuarios usuario) {
        this.idRol = idRol;
        this.rol = rol;
        this.usuario = usuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}

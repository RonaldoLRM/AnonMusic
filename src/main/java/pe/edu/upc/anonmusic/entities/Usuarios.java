package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "contrasenia", nullable = false, length = 100)
    private String contrasenia;

    public Usuarios() {
    }

    public Usuarios(int codigo, String email, String nombre, String contrasenia) {
        this.codigo = codigo;
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}

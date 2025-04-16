package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "email", nullable = false, length = 100)
    private String email;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "contrasenia", nullable = false, length = 100)
    private String contrasenia;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, String email, String nombre, String contrasenia) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

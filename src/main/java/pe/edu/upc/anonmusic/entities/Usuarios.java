package pe.edu.upc.anonmusic.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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
    @JsonIgnore
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Roles> roles = new ArrayList<Roles>();
    public Usuarios() {
    }

    public Usuarios(int idUsuario, String email, String nombre, String contrasenia, List<Roles> roles) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.roles = roles;
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

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}

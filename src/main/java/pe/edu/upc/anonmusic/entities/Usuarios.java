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
    @Column(name = "username",unique = true, nullable = false, length = 100)
    private String username;
    @Column(name = "contrasenia", nullable = false, length = 200)
    private String password;
    private Boolean enabled;
    @JsonIgnore
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Roles> roles;
    public Usuarios() {
    }

    public Usuarios(int idUsuario, String email, String username, String password, Boolean enabled, List<Roles> roles) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }
}

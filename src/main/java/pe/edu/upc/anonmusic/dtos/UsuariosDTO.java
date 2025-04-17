package pe.edu.upc.anonmusic.dtos;

import jakarta.persistence.*;
import pe.edu.upc.anonmusic.entities.Publicaciones;

import java.util.List;

public class UsuariosDTO {
    private int idUsuario;
    private String email;
    private String nombre;
    private String contrasenia;

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

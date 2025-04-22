package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PlaylistsXUsuario")
public class PlaylistsXUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylistsXUsuario;
    @Column(name = "archivo", nullable = false)
    private String archivo;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "Usuarios")
    private Usuarios usuarios;

    public PlaylistsXUsuario() {
    }

    public PlaylistsXUsuario(int idPlaylistsXUsuario, String archivo, String nombre, Usuarios usuarios) {
        this.idPlaylistsXUsuario = idPlaylistsXUsuario;
        this.archivo = archivo;
        this.nombre = nombre;
        this.usuarios = usuarios;
    }

    public int getIdPlaylistsXUsuario() {
        return idPlaylistsXUsuario;
    }

    public void setIdPlaylistsXUsuario(int idPlaylistsXUsuario) {
        this.idPlaylistsXUsuario = idPlaylistsXUsuario;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}

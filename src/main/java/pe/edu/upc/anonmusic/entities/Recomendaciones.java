package pe.edu.upc.anonmusic.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Recomendaciones")
public class Recomendaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecomendacion;
    @Column(name="contenido", nullable=false,length=100)
    private String contenido;
    @Column(name="razon", nullable=false,length=255)
    private String razon;
    @Column(name="vista",nullable=false)
    private boolean vista;
    @ManyToOne
    @JoinColumn(name="PlaylistXUsuario")
    private PlaylistsXUsuario playlistxUsuario;
    public Recomendaciones() {}

    public Recomendaciones(int idRecomendacion, String contenido, String razon, boolean vista, PlaylistsXUsuario playlistxUsuario) {
        this.idRecomendacion = idRecomendacion;
        this.contenido = contenido;
        this.razon = razon;
        this.vista = vista;
        this.playlistxUsuario = playlistxUsuario;
    }

    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public boolean isVista() {
        return vista;
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public PlaylistsXUsuario getPlaylistxUsuario() {
        return playlistxUsuario;
    }

    public void setPlaylistxUsuario(PlaylistsXUsuario playlistxUsuario) {
        this.playlistxUsuario = playlistxUsuario;
    }
}

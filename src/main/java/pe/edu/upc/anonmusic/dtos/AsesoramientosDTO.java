package pe.edu.upc.anonmusic.dtos;

import pe.edu.upc.anonmusic.entities.Musica;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;

public class AsesoramientosDTO {

    private int IdAsesoramiento;

    private LocalDate fechaSolicitud;

    private Musica musica;

    private LocalDate fechaAtendido;

    private Usuarios usuario;

    public int getIdAsesoramiento() {
        return IdAsesoramiento;
    }

    public void setIdAsesoramiento(int idAsesoramiento) {
        IdAsesoramiento = idAsesoramiento;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public LocalDate getFechaAtendido() {
        return fechaAtendido;
    }

    public void setFechaAtendido(LocalDate fechaAtendido) {
        this.fechaAtendido = fechaAtendido;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}

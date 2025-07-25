package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.entities.Publicaciones;

import java.time.LocalDate;
import java.util.List;

public interface IPublicacionesService {
    public List<Publicaciones> list();
    public void post(Publicaciones publicaciones);
    public Publicaciones searchId(int id);
    public void update(Publicaciones publicaciones);
    public void delete(int id);
    List<String[]>PublicacionesConMasComentarios();
    List<String[]>PublicacionesPorFecha(LocalDate fechaingresada);
}

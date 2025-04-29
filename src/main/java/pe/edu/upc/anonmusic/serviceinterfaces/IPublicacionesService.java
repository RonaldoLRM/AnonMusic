package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Publicaciones;

import java.util.List;

public interface IPublicacionesService {
    public List<Publicaciones> list();
    public void post(Publicaciones publicaciones);
    public void update(Publicaciones publicaciones);
    public void delete(int id);
    List<String[]>PublicacionesConMasComentarios();
}

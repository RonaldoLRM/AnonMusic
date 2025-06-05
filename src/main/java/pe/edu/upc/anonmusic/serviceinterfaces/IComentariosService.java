package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Comentarios;

import java.util.List;

public interface IComentariosService {
    public List<Comentarios> list();
    public void post(Comentarios comentarios);
    public Comentarios searchId(int id);
    public void update(Comentarios comentarios);
    public void delete(int id);
}

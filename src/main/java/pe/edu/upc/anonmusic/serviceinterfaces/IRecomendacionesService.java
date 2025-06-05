package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.entities.Recomendaciones;

import java.util.List;

public interface IRecomendacionesService {
    public List<Recomendaciones> list();
    public void post(Recomendaciones recomendaciones);
    public Recomendaciones searchId(int id);
    public void update(Recomendaciones recomendaciones);
    public void delete(int id);
}

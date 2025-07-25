package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.entities.Reacciones;

import java.util.List;

public interface IReaccionesService {
    public List<Reacciones> list();
    public void post(Reacciones reacciones);
    public Reacciones searchId(int id);
    public void update(Reacciones reacciones);
    public void delete(int id);
}

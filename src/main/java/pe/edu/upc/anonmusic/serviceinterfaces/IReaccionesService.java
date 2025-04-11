package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Reacciones;


import java.util.List;

public interface IReaccionesService {
    public List<Reacciones> list();
    public void add(Reacciones reacciones);
    public void update(Reacciones reacciones);
    public void delete(int id);
}

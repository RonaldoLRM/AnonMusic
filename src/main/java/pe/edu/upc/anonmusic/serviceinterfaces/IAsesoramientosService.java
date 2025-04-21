package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Asesoramientos;

import java.util.List;

public interface IAsesoramientosService {
    public List<Asesoramientos> list();
    public void post(Asesoramientos asesoramientos);
    public void update(Asesoramientos asesoramientos);
    public void delete(int id);
}

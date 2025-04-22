package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Seguidores;

import java.util.List;

public interface ISeguidoresService {
    public List<Seguidores> list();
    public void post(Seguidores seguidores);
    public void update(Seguidores seguidores);
    public void delete(int id);
}

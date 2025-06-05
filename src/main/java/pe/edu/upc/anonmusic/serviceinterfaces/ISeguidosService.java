package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.entities.Seguidores;
import pe.edu.upc.anonmusic.entities.Seguidos;

import java.util.List;

public interface ISeguidosService {
    public List<Seguidos> list();
    public void post(Seguidos seguidos);
    public Seguidos searchId(int id);
    public void update(Seguidos seguidos);
    public void delete(int id);
}
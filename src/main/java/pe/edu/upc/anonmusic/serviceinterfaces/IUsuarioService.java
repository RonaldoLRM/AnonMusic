package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Usuarios;

import java.util.List;

public interface IUsuarioService {
    public List<Usuarios> list();
    public Usuarios searchId(int id);
    public void post(Usuarios usuarios);
    public void update(Usuarios usuarios);
    public void delete(int id);
}

package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Roles;

import java.util.List;

public interface IRolesService {
    public List<Roles> list();
    public void post(Roles roles);
    public void update(Roles roles);
    public void delete(int id);
}

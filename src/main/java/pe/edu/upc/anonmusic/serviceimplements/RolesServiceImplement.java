package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Roles;
import pe.edu.upc.anonmusic.repositories.IRolesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IRolesService;

import java.util.List;

@Service
public class RolesServiceImplement implements IRolesService {
    @Autowired
    private IRolesRepository rR;

    @Override
    public List<Roles> list() {
        return rR.findAll();
    }

    @Override
    public void post (Roles roles) {
        rR.save(roles);
    }

    @Override
    public void update (Roles roles) {
        rR.save(roles);
    }

    @Override
    public void delete (int id) {
        rR.deleteById(id);
    }

}

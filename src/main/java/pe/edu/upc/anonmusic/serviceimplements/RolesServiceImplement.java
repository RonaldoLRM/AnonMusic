package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.Roles;
import pe.edu.upc.anonmusic.repositories.IRolesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IRolesService;

import java.util.List;

@Service
public class RolesServiceImplement implements IRolesService {
    @Autowired
    private IRolesRepository roR;

    @Override
    public List<Roles> list() {
        return roR.findAll();
    }

    @Override
    public void post (Roles roles) {
        roR.save(roles);
    }

    @Override
    public Roles searchId(int id) {
        return roR.findById(id).orElse(new Roles());
    }

    @Override
    public void update (Roles roles) {
        roR.save(roles);
    }

    @Override
    public void delete (int id) {
        roR.deleteById(id);
    }

}

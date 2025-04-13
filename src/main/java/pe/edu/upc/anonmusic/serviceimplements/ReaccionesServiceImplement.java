package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Reacciones;
import pe.edu.upc.anonmusic.repositories.IReaccionesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IReaccionesService;

import java.util.List;
@Service
public class ReaccionesServiceImplement implements IReaccionesService {
    @Autowired
    private IReaccionesRepository rR;

    @Override
    public List<Reacciones> list() {
        return rR.findAll();
    }

    @Override
    public void post(Reacciones reacciones) {
        rR.save(reacciones);
    }

    @Override
    public void update(Reacciones reacciones) {
        rR.save(reacciones);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }
}

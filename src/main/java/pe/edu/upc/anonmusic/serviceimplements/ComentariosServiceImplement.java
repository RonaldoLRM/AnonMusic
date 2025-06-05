package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.repositories.IComentariosRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IComentariosService;

import java.util.List;

@Service
public class ComentariosServiceImplement implements IComentariosService {
    @Autowired
    private IComentariosRepository cR;

    @Override
    public List<Comentarios> list() {
        return cR.findAll();
    }

    @Override
    public void post(Comentarios comentarios) {
        cR.save(comentarios);
    }

    @Override
    public Comentarios searchId(int id) {
        return cR.findById(id).orElse(new Comentarios());
    }

    @Override
    public void update(Comentarios comentarios) {
        cR.save(comentarios);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }
}

package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.Recomendaciones;
import pe.edu.upc.anonmusic.repositories.IRecomendacionesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IRecomendacionesService;

import java.util.List;
@Service

public class RecomendacionesServiceImplement implements IRecomendacionesService {
    @Autowired
    private IRecomendacionesRepository reR;
    @Override
    public List<Recomendaciones> list() {
        return reR.findAll();
    }

    @Override
    public void post(Recomendaciones recomendaciones) {
        reR.save(recomendaciones);
    }

    @Override
    public Recomendaciones searchId(int id) {
        return reR.findById(id).orElse(new Recomendaciones());
    }

    @Override
    public void update(Recomendaciones recomendaciones) {
        reR.save(recomendaciones);
    }

    @Override
    public void delete(int id) {
        reR.deleteById(id);
    }
}

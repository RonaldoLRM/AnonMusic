package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Recomendaciones;
import pe.edu.upc.anonmusic.repositories.IRecomendacionesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IRecomendacionesService;

import java.util.List;
@Service

public class RecomendacionesServiceImplement implements IRecomendacionesService {
    @Autowired
    private IRecomendacionesRepository rR;
    @Override
    public List<Recomendaciones> list() {
        return rR.findAll();
    }

    @Override
    public void post(Recomendaciones recomendaciones) {
        rR.save(recomendaciones);
    }

    @Override
    public void update(Recomendaciones recomendaciones) {
        rR.save(recomendaciones);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }
}

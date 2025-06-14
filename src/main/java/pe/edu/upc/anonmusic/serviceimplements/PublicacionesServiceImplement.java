package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.Publicaciones;
import pe.edu.upc.anonmusic.repositories.IPublicacionesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IPublicacionesService;

import java.time.LocalDate;
import java.util.List;
@Service
public class PublicacionesServiceImplement implements IPublicacionesService {
    @Autowired
    private IPublicacionesRepository pR;

    @Override
    public List<Publicaciones> list() {
        return pR.findAll();
    }

    @Override
    public void post(Publicaciones publicaciones) {
        pR.save(publicaciones);
    }

    @Override
    public Publicaciones searchId(int id) {
        return pR.findById(id).orElse(new Publicaciones());
    }

    @Override
    public void update(Publicaciones publicaciones) {
        pR.save(publicaciones);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<String[]> PublicacionesConMasComentarios() {
        return pR.PublicacionesConMasComentarios();
    }

    @Override
    public List<String[]> PublicacionesPorFecha(LocalDate fechaingresada) {
        return pR.PublicacionesPorFecha(fechaingresada);
    }
}

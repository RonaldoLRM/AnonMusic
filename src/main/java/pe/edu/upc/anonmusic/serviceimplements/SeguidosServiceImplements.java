package pe.edu.upc.anonmusic.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.Seguidos;
import pe.edu.upc.anonmusic.repositories.ISeguidosRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.ISeguidosService;

import java.util.List;
@Service
public class SeguidosServiceImplements implements ISeguidosService {
    @Autowired
    private ISeguidosRepository seR;
    @Override
    public List<Seguidos> list() {
        return seR.findAll();
    }

    @Override
    public void post(Seguidos seguidos) {
        seR.save(seguidos);
    }

    @Override
    public Seguidos searchId(int id) {
        return seR.findById(id).orElse(new Seguidos());
    }

    @Override
    public void update(Seguidos seguidos) {
        seR.save(seguidos);
    }

    @Override
    public void delete(int id) {
        seR.deleteById(id);
    }
}
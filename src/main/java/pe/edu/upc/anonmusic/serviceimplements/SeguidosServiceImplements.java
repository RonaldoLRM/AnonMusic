package pe.edu.upc.anonmusic.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Seguidos;
import pe.edu.upc.anonmusic.repositories.ISeguidosRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.ISeguidosService;

import java.util.List;
@Service
public class SeguidosServiceImplements implements ISeguidosService {
    @Autowired
    private ISeguidosRepository sR;
    @Override
    public List<Seguidos> list() {
        return sR.findAll();
    }

    @Override
    public void post(Seguidos seguidos) {
        sR.save(seguidos);
    }

    @Override
    public void update(Seguidos seguidos) {
        sR.save(seguidos);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
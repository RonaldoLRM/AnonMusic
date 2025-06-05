package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.Seguidores;
import pe.edu.upc.anonmusic.repositories.ISeguidoresRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.ISeguidoresService;

import java.util.List;

@Service
public class SeguidoresServiceImplements implements ISeguidoresService {
    @Autowired
    private ISeguidoresRepository sR;
    @Override
    public List<Seguidores> list() {
        return sR.findAll();
    }

    @Override
    public void post(Seguidores seguidores) {
        sR.save(seguidores);
    }

    @Override
    public Seguidores searchId(int id) {
        return sR.findById(id).orElse(new Seguidores());
    }

    @Override
    public void update(Seguidores seguidores) {
        sR.save(seguidores);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}

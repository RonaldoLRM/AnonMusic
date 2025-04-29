package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Musica;
import pe.edu.upc.anonmusic.repositories.IMusicaRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IMusicaService;

import java.util.List;

@Service
public class MusicaServieImplemente implements IMusicaService {
    @Autowired
    private IMusicaRepository mR;

    @Override
    public List<Musica> list() {
        return mR.findAll();
    }

    @Override
    public Musica searchId(int id) {
        return mR.findById(id).orElse(new Musica());
    }

    @Override
    public void post(Musica musica) {
        mR.save(musica);
    }

    @Override
    public void update(Musica musica) {
        mR.save(musica);
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }

    @Override
    public List<String[]> UsuariossinAsesoramientos() {
        return mR.UsuariossinAsesoramientos();
    }
}

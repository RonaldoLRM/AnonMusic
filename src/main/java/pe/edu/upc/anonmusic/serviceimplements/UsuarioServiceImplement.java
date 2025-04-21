package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Usuarios;
import pe.edu.upc.anonmusic.repositories.IUsuarioRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IUsuarioService;

import java.util.List;
@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }

    @Override
    public Usuarios searchId(int id) {
        return uR.findById(id).orElse(new Usuarios());
    }

    @Override
    public void post(Usuarios usuarios) {uR.save(usuarios);}

    @Override
    public void update(Usuarios usuarios) {
        uR.save(usuarios);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public List<String[]> UsuarioconPublicacionConMasLikes() {
        return uR.UsuarioconPublicacionConMasLikes();
    }
}

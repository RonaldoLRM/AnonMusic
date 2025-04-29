package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Usuarios;
import pe.edu.upc.anonmusic.repositories.IUsuarioRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IUsuarioService;

import java.time.LocalDate;
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
    public List<String[]> UsuariosconPublicacionConMasLikes(LocalDate fechaInicio, LocalDate fechafin) {
        return uR.UsuariosconPublicacionConMasLikes(fechaInicio, fechafin);
    }

    @Override
    public List<String[]> UsuariosconMasSeguidores() {
        return uR.UsuariosconMasSeguidores();
    }

    @Override
    public List<String[]> UsuarioconPlaylistCreadas(){return uR.UsuarioconPlaylistCreadas();}

    @Override
    public List<String[]> UsuariosconMasMusicaAnonima() {
        return uR.UsuariosconMasMusicaAnonima();
    }

    @Override
    public List<String[]> UsuariosconMasNotificacionesNoLeidas() {
        return uR.UsuariosconMasNotificacionesNoLeidas();
    }

}

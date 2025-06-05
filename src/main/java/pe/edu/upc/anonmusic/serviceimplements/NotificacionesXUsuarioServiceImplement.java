package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.entities.NotificacionesXUsuario;
import pe.edu.upc.anonmusic.repositories.INotificacionesXUsuarioRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.INotificacionesXUsuarioService;

import java.util.List;
@Service
public class NotificacionesXUsuarioServiceImplement implements INotificacionesXUsuarioService {
    @Autowired
    private INotificacionesXUsuarioRepository nxuR;

    @Override
    public List<NotificacionesXUsuario> list() {
        return nxuR.findAll();
    }

    @Override
    public void post(NotificacionesXUsuario notificacionesXUsuario) {
        nxuR.save(notificacionesXUsuario);
    }

    @Override
    public NotificacionesXUsuario searchId(int id) {
        return nxuR.findById(id).orElse(new NotificacionesXUsuario());
    }

    @Override
    public void update(NotificacionesXUsuario notificacionesXUsuario) {
        nxuR.save(notificacionesXUsuario);
    }

    @Override
    public void delete(int id) {
        nxuR.deleteById(id);
    }
}

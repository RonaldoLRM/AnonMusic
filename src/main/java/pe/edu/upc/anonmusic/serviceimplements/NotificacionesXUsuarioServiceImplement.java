package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.NotificacionesXUsuario;
import pe.edu.upc.anonmusic.repositories.INotificacionesXUsuarioRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.INotificacionesXUsuarioService;

import java.util.List;
@Service
public class NotificacionesXUsuarioServiceImplement implements INotificacionesXUsuarioService {
    @Autowired
    private INotificacionesXUsuarioRepository nxuS;

    @Override
    public List<NotificacionesXUsuario> list() {
        return nxuS.findAll();
    }

    @Override
    public void post(NotificacionesXUsuario notificacionesXUsuario) {
        nxuS.save(notificacionesXUsuario);
    }

    @Override
    public void update(NotificacionesXUsuario notificacionesXUsuario) {
        nxuS.save(notificacionesXUsuario);
    }

    @Override
    public void delete(int id) {
        nxuS.deleteById(id);
    }
}

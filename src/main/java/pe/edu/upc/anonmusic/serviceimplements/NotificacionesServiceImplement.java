package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Notificaciones;
import pe.edu.upc.anonmusic.repositories.INotificacionesRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.INotificacionesService;

import java.util.List;

@Service
public class NotificacionesServiceImplement implements INotificacionesService {
    @Autowired
    private INotificacionesRepository nR;
    @Override
    public List<Notificaciones> list() {
        return nR.findAll();
    }

    @Override
    public void post(Notificaciones notificacion) {
        nR.save(notificacion);
    }

    @Override
    public void update(Notificaciones notificacion) {
        nR.save(notificacion);
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public List<String[]> CantidadNotificacionesNoVistas() {
        return nR.CantidadNotificacionesNoVistas();
    }
}

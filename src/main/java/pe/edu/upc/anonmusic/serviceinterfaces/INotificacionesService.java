package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Notificaciones;

import java.util.List;

public interface INotificacionesService {
    public List<Notificaciones> list();
    public void post(Notificaciones notificacion);
    public void update(Notificaciones notificacion);
    public void delete(int id);
}

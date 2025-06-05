package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.entities.NotificacionesXUsuario;

import java.util.List;

public interface INotificacionesXUsuarioService {
    public List<NotificacionesXUsuario> list();
    public void post(NotificacionesXUsuario notificacionesXUsuario);
    public NotificacionesXUsuario searchId(int id);
    public void update(NotificacionesXUsuario notificacionesXUsuario);
    public void delete(int id);
}

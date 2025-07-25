package pe.edu.upc.anonmusic.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;

public interface IUsuarioService {
    List<String[]> Listausuarios();
    public Usuarios searchId(int id);
    public void post(Usuarios usuarios);
    public void update(Usuarios usuarios);
    public void delete(int id);
    List<String[]> UsuariosconPublicacionConMasLikes(LocalDate fechaInicio,LocalDate fechafin);
    List<String[]>UsuariosconMasSeguidores();
    List<String[]> UsuarioconPlaylistCreadas();
    List<String[]> UsuariosconMasMusicaAnonima();
    List<String[]> UsuariosconMasNotificacionesNoLeidas();
    List<String[]> usuariosConMasReaccionesNegativas();

}

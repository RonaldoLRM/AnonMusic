package pe.edu.upc.anonmusic.serviceinterfaces;

import pe.edu.upc.anonmusic.entities.Musica;

import java.time.LocalDate;
import java.util.List;

public interface IMusicaService {
    public List<Musica> list();
    public Musica searchId(int id);
    public void post(Musica musica);
    public void update(Musica musica);
    public void delete(int id);
    List<String[]> UsuariossinAsesoramientos();
    List<String[]> CantidadDeMusicasPorFecha(LocalDate fechaInicio , LocalDate fechaFin);
}

package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Musica;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IMusicaRepository extends JpaRepository<Musica, Integer> {
    @Query(value = "SELECT u.username AS nombre_usuario, m.nombre AS nombre_musica\n" +
            "FROM musica m\n" +
            "JOIN usuarios u ON m.id_usuario = u.id_usuario\n" +
            "JOIN asesoramientos a ON a.id_musica = m.id_musica\n" +
            "WHERE a.fecha_atendido IS NULL;\n",nativeQuery = true)
    List<String[]> UsuariossinAsesoramientos();

    @Query(value = "SELECT count(m.id_musica) as TotalMusicas\n" +
            "FROM public.musica as m\n" +
            "INNER JOIN public.usuarios as u ON u.id_usuario=m.id_usuario\n" +
            "INNER JOIN public.publicaciones as p on p.id_usuario=u.id_usuario\n" +
            "WHERE m.usado is TRUE and p.privacidad is FALSE and p.fecha_publicacion BETWEEN :fechaInicio and :fechafin",nativeQuery = true)
    List<String[]> CantidadDeMusicasPorFecha(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechafin") LocalDate fechafin);
}

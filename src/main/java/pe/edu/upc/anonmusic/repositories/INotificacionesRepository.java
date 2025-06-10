package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Notificaciones;

import java.util.List;

@Repository
public interface INotificacionesRepository extends JpaRepository<Notificaciones, Integer> {
    @Query(value = "SELECT n.tipo_notificacion, COUNT(*) AS cantidad_no_vistas\n" +
            " FROM notificacionesxusuario npu\n" +
            " JOIN notificaciones n ON npu.id_notificaciones = n.id_notificacion\n" +
            " WHERE npu.visto = FALSE\n" +
            " GROUP BY n.tipo_notificacion", nativeQuery = true)
    List<String[]> CantidadNotificacionesNoVistas();
}

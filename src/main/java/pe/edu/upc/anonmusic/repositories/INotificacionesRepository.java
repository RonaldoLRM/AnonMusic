package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Notificaciones;

@Repository
public interface INotificacionesRepository extends JpaRepository<Notificaciones, Integer> {
}

package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.anonmusic.entities.Publicaciones;

public interface IPublicacionesRepository extends JpaRepository<Publicaciones, Integer> {
}

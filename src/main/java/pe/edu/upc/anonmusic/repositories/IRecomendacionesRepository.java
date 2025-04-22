package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.anonmusic.entities.Recomendaciones;

public interface IRecomendacionesRepository extends JpaRepository<Recomendaciones, Integer> {
}

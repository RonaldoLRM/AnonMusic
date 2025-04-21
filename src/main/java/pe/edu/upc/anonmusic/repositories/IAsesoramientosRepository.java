package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Asesoramientos;

@Repository
public interface IAsesoramientosRepository extends JpaRepository<Asesoramientos, Integer> {
}

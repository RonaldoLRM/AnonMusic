package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Usuarios;
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Integer> {
}

package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Musica;

import java.util.List;

@Repository
public interface IMusicaRepository extends JpaRepository<Musica, Integer> {
    @Query(value = "SELECT u.username AS nombre_usuario, m.nombre AS nombre_musica\n" +
            "FROM musica m\n" +
            "JOIN usuarios u ON m.id_usuario = u.id_usuario\n" +
            "JOIN asesoramientos a ON a.id_musica = m.id_musica\n" +
            "WHERE a.fecha_atendido IS NULL;\n",nativeQuery = true)
    List<String[]> UsuariossinAsesoramientos();
}

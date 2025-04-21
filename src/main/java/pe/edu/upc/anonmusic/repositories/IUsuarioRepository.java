package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Integer> {
    @Query(value="Select u.nombre as \"Nombre de usuario\", count (r.tipo) as \"Likes\"\n" +
            "from usuarios u\n" +
            "join publicaciones p on U.id_usuario = P.id_usuario\n" +
            "join reacciones r on p.id_publicacion = r.id_publicacion\n" +
            "where r.tipo= true\n" +
            "group by u.nombre",nativeQuery = true)
    List<String[]> UsuarioconPublicacionConMasLikes();
}

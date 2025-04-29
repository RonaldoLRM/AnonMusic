package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Integer> {
    @Query(value="Select u.nombre as \"Nombre de usuario\", count (r.tipo= true) as \"Likes\"\n" +
            "from usuarios u\n" +
            "join publicaciones p on U.id_usuario = P.id_usuario\n" +
            "join reacciones r on p.id_publicacion = r.id_publicacion\n" +
            "where p.archivo is not null and p.privacidad=false and p.fecha_publicacion between :fechaInicio and :fechafin\n" +
            "group by u.nombre\n" +
            "order by count(r.tipo) desc\n" +
            "limit 5",nativeQuery = true)
    List<String[]> UsuariosconPublicacionConMasLikes(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechafin") LocalDate fechafin);
    @Query(value="SELECT u.id_Usuario, u.nombre, u.email, SUM(s.cantidad) AS totalSeguidores\n" +
            "FROM Seguidores s\n" +
            "INNER JOIN Usuarios u ON s.id_Usuario = u.id_Usuario\n" +
            "GROUP BY u.id_Usuario, u.nombre, u.email\n" +
            "ORDER BY totalSeguidores DESC\n" +
            "LIMIT 10;", nativeQuery = true)
    List<String[]> UsuariosconMasSeguidores();
}

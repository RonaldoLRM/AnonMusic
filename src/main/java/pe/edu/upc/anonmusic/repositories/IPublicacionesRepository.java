package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.anonmusic.entities.Publicaciones;

import java.util.List;

@Repository
public interface IPublicacionesRepository extends JpaRepository<Publicaciones, Integer> {
    @Query(value = "SELECT pu.id_publicacion, COUNT (co.id_comentario)\n" +
            " FROM comentarios co\n" +
            " INNER JOIN publicaciones pu ON co.id_publicacion=pu.id_publicacion\n" +
            " GROUP BY (pu.id_publicacion)", nativeQuery = true)
    List<String[]> PublicacionesConMasComentarios();
}

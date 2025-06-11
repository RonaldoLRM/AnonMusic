package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.anonmusic.entities.Usuarios;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuarios, Integer> {
    public Usuarios findOneByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Usuarios u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);


    @Query(value="Select u.username as \"Nombre de usuario\", count (r.tipo= true) as \"Likes\"\n" +
            "from usuarios u\n" +
            "join publicaciones p on U.id_usuario = P.id_usuario\n" +
            "join reacciones r on p.id_publicacion = r.id_publicacion\n" +
            "where p.archivo is not null and p.privacidad=false and p.fecha_publicacion between :fechaInicio and :fechafin\n" +
            "group by u.username\n" +
            "order by count(r.tipo) desc\n" +
            "limit 5",nativeQuery = true)
    List<String[]> UsuariosconPublicacionConMasLikes(@Param("fechaInicio") LocalDate fechaInicio, @Param("fechafin") LocalDate fechafin);
    @Query(value="SELECT u.id_Usuario, u.username, u.email, SUM(s.cantidad) AS totalSeguidores\n" +
            "FROM Seguidores s\n" +
            "INNER JOIN Usuarios u ON s.id_Usuario = u.id_Usuario\n" +
            "GROUP BY u.id_Usuario, u.username, u.email\n" +
            "ORDER BY totalSeguidores DESC\n" +
            "LIMIT 10;", nativeQuery = true)
    List<String[]> UsuariosconMasSeguidores();

    @Query(value="SELECT u.id_usuario, u.username, COUNT(p.id_playlistsxusuario) AS cantidad_playlists\n" +
            " FROM usuarios u\n" +
            " JOIN playlistsxusuario p ON u.id_usuario = p.usuarios\n" +
            " GROUP BY u.id_usuario, u.username\n" +
            " ORDER BY cantidad_playlists DESC;", nativeQuery = true)
    List<String[]> UsuarioconPlaylistCreadas();

    @Query(value="SELECT u.id_usuario, u.username, COUNT(m.id_musica) AS total_musica_anonima\n" +
            "FROM usuarios u\n" +
            "LEFT JOIN musica m ON u.id_usuario = m.id_usuario\n" +
            "WHERE m.privacidad = true\n" +
            "GROUP BY u.id_usuario\n" +
            "ORDER BY total_musica_anonima DESC\n" +
            "LIMIT 5;", nativeQuery = true)
    List<String[]> UsuariosconMasMusicaAnonima();

    @Query(value="SELECT u.id_usuario, u.username, COUNT(npu.id_notificacionesx_usuario) AS total_notificaciones_no_leidas\n" +
            "FROM usuarios u\n" +
            "LEFT JOIN notificacionesxusuario npu ON u.id_usuario = npu.id_usuario\n" +
            "WHERE npu.visto = false\n" +
            "GROUP BY u.id_usuario\n" +
            "ORDER BY total_notificaciones_no_leidas DESC\n" +
            "LIMIT 5;", nativeQuery = true)
    List<String[]> UsuariosconMasNotificacionesNoLeidas();
    @Query(value = "SELECT u.id_usuario, u.username, COUNT(r.id_reacciones) AS total_reacciones_negativas \n" +
            "            FROM usuarios u \n" +
            "            LEFT JOIN reacciones r ON u.id_usuario = r.idusuario \n" +
            "            WHERE r.tipo = FALSE\n" +
            "            GROUP BY u.id_usuario \n" +
            "            ORDER BY total_reacciones_negativas DESC \n" +
            "            LIMIT 5;", nativeQuery = true)
    List<String[]> usuariosConMasReaccionesNegativas();
    @Query(value="SELECT id_usuario,email,enabled,username\n" +
            "FROM Usuarios",nativeQuery = true)
    List<String[]> Listausuarios();

}

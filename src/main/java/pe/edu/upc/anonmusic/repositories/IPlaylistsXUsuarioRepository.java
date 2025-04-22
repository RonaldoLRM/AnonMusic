package pe.edu.upc.anonmusic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.anonmusic.entities.PlaylistsXUsuario;

public interface IPlaylistsXUsuarioRepository extends JpaRepository<PlaylistsXUsuario, Integer> {
}

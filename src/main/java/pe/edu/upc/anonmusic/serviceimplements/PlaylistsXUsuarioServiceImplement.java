package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.PlaylistsXUsuario;
import pe.edu.upc.anonmusic.repositories.IPlaylistsXUsuarioRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IPlaylistsXUsuarioService;

import java.util.List;

@Service
public class PlaylistsXUsuarioServiceImplement implements IPlaylistsXUsuarioService {
    @Autowired
    private IPlaylistsXUsuarioRepository plR;
    @Override
    public List<PlaylistsXUsuario> list() {
        return plR.findAll();
    }

    @Override
    public void post(PlaylistsXUsuario playlistsXUsuario) {
        plR.save(playlistsXUsuario);
    }

    @Override
    public void update(PlaylistsXUsuario playlistsXUsuario) {
        plR.save(playlistsXUsuario);
    }

    @Override
    public void delete(int id) {
        plR.deleteById(id);
    }

}

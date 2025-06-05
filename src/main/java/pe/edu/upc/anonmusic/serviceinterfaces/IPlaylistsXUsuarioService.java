package pe.edu.upc.anonmusic.serviceinterfaces;


import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.entities.PlaylistsXUsuario;

import java.util.List;

public interface IPlaylistsXUsuarioService {
    public List<PlaylistsXUsuario> list();
    public void post(PlaylistsXUsuario playlistsXUsuario);
    public PlaylistsXUsuario searchId(int id);
    public void update(PlaylistsXUsuario playlistsXUsuario);
    public void delete(int id);
}

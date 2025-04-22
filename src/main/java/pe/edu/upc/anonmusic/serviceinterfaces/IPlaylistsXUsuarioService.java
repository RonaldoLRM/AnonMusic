package pe.edu.upc.anonmusic.serviceinterfaces;


import pe.edu.upc.anonmusic.entities.PlaylistsXUsuario;

import java.util.List;

public interface IPlaylistsXUsuarioService {
    public List<PlaylistsXUsuario> list();
    public void post(PlaylistsXUsuario playlistsXUsuario);
    public void update(PlaylistsXUsuario playlistsXUsuario);
    public void delete(int id);
}

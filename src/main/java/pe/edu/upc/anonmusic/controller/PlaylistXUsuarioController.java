package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.PlaylistsXUsuarioDTO;
import pe.edu.upc.anonmusic.entities.PlaylistsXUsuario;
import pe.edu.upc.anonmusic.serviceinterfaces.IPlaylistsXUsuarioService;
import pe.edu.upc.anonmusic.serviceinterfaces.IPublicacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlistsxusuario")
public class PlaylistXUsuarioController {
    @Autowired
    private IPlaylistsXUsuarioService plS;

    @GetMapping("/listado")
    public List<PlaylistsXUsuarioDTO> listar() {
        return plS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, PlaylistsXUsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody PlaylistsXUsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        PlaylistsXUsuario pl=m.map(dto, PlaylistsXUsuario.class);
        plS.post(pl);
    }

    @GetMapping("/{id}")
    public PlaylistsXUsuarioDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        PlaylistsXUsuarioDTO dto = m.map(plS.searchId(id), PlaylistsXUsuarioDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody PlaylistsXUsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        PlaylistsXUsuario pl=m.map(dto, PlaylistsXUsuario.class);
        plS.update(pl);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        plS.delete(id);
    }
}

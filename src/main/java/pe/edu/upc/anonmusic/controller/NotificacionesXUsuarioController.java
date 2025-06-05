package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.NotificacionesXUsuarioDTO;
import pe.edu.upc.anonmusic.entities.NotificacionesXUsuario;
import pe.edu.upc.anonmusic.serviceinterfaces.INotificacionesXUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificacionesxusuario")
public class NotificacionesXUsuarioController {
    @Autowired
    private INotificacionesXUsuarioService nxuS;

    @GetMapping("/listado")
    public List<NotificacionesXUsuarioDTO> listar() {
        return nxuS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NotificacionesXUsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody NotificacionesXUsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        NotificacionesXUsuario n=m.map(dto,NotificacionesXUsuario.class);
        nxuS.post(n);
    }

    @GetMapping("/{id}")
    public NotificacionesXUsuarioDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        NotificacionesXUsuarioDTO dto = m.map(nxuS.searchId(id), NotificacionesXUsuarioDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody NotificacionesXUsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        NotificacionesXUsuario n=m.map(dto,NotificacionesXUsuario.class);
        nxuS.update(n);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        nxuS.delete(id);
    }
}

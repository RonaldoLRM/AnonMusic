package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.entities.Notificaciones;
import pe.edu.upc.anonmusic.serviceinterfaces.INotificacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/notificaciones")
@RestController
public class NotificacionesController {
    @Autowired
    private INotificacionesService nS;

    @GetMapping("/listado")
    public List<NotificacionesDTO> listar() {
        return nS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,NotificacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody NotificacionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Notificaciones r=m.map(dto,Notificaciones.class);
        nS.post(r);
    }
    @PutMapping("/modificar")
    public void modificar(@RequestBody NotificacionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Notificaciones r=m.map(dto,Notificaciones.class);
        nS.update(r);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        nS.delete(id);
    }
}

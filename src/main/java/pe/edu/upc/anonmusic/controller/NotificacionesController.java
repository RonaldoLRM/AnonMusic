package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.NotificacionesNoVistasDTO;
import pe.edu.upc.anonmusic.entities.Notificaciones;
import pe.edu.upc.anonmusic.serviceinterfaces.INotificacionesService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
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
        Notificaciones n=m.map(dto,Notificaciones.class);
        nS.post(n);
    }
    @PutMapping("/modificar")
    public void modificar(@RequestBody NotificacionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Notificaciones n=m.map(dto,Notificaciones.class);
        nS.update(n);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        nS.delete(id);
    }

    @GetMapping("/notificacionesnovistas")
    public List<NotificacionesNoVistasDTO> notificacionesnovistas() {
        List<String[]> lista = nS.CantidadNotificacionesNoVistas();
        List<NotificacionesNoVistasDTO> dtos = new ArrayList<>();
        for (String[] columna : lista) {
            NotificacionesNoVistasDTO dto = new NotificacionesNoVistasDTO();
            dto.setTipoNotificacion(columna[0]);
            dto.setCantidadNotificacionesNoVistas(Integer.parseInt(columna[1]));
            dtos.add(dto);
        }
        return dtos;
    }
}

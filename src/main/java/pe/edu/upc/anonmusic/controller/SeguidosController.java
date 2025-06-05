package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.SeguidosDTO;
import pe.edu.upc.anonmusic.entities.Seguidos;
import pe.edu.upc.anonmusic.serviceinterfaces.ISeguidosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Seguidos")
public class SeguidosController {
    @Autowired
    private ISeguidosService seS;
    @GetMapping("/listado")
    public List<SeguidosDTO> listar(){
        return seS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,SeguidosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody SeguidosDTO dto){
        ModelMapper m = new ModelMapper();
        Seguidos se = m.map(dto,Seguidos.class);
        seS.post(se);
    }

    @GetMapping("/{id}")
    public SeguidosDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        SeguidosDTO dto = m.map(seS.searchId(id), SeguidosDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody SeguidosDTO dto){
        ModelMapper m = new ModelMapper();
        Seguidos r = m.map(dto,Seguidos.class);
        seS.update(r);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")int id){
        seS.delete(id);
    }
}

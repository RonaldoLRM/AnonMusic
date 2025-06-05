package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.SeguidoresDTO;
import pe.edu.upc.anonmusic.entities.Seguidores;
import pe.edu.upc.anonmusic.serviceinterfaces.ISeguidoresService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Seguidores")
public class SeguidoresController {
    @Autowired
    private ISeguidoresService sS;
    @GetMapping("/listado")
    public List<SeguidoresDTO> listar(){
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,SeguidoresDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody SeguidoresDTO dto){
        ModelMapper m = new ModelMapper();
        Seguidores s = m.map(dto,Seguidores.class);
        sS.post(s);
    }

    @GetMapping("/{id}")
    public SeguidoresDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        SeguidoresDTO dto = m.map(sS.searchId(id), SeguidoresDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody SeguidoresDTO dto){
        ModelMapper m = new ModelMapper();
        Seguidores s = m.map(dto,Seguidores.class);
        sS.update(s);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")int id){
        sS.delete(id);
    }
}

package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.SeguidoresDTO;
import pe.edu.upc.anonmusic.entities.Seguidores;
import pe.edu.upc.anonmusic.serviceinterfaces.ISeguidoresService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Seguidores")
public class SeguidoresController {
    @Autowired
    private ISeguidoresService rS;
    @GetMapping("/listado")
    public List<SeguidoresDTO> listar(){
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,SeguidoresDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody SeguidoresDTO dto){
        ModelMapper m = new ModelMapper();
        Seguidores r = m.map(dto,Seguidores.class);
        rS.post(r);
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody SeguidoresDTO dto){
        ModelMapper m = new ModelMapper();
        Seguidores r = m.map(dto,Seguidores.class);
        rS.update(r);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")int id){
        rS.delete(id);
    }
}

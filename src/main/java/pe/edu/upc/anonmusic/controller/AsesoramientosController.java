package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.AsesoramientosDTO;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.serviceinterfaces.IAsesoramientosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Asesoramientos")
public class AsesoramientosController {
    @Autowired
    private IAsesoramientosService aS;

    @GetMapping("/listado")
    public List<AsesoramientosDTO> listar(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AsesoramientosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody AsesoramientosDTO dto) {
        ModelMapper m=new ModelMapper();
        Asesoramientos a = m.map(dto,Asesoramientos.class);
        aS.post(a);
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody AsesoramientosDTO dto) {
        ModelMapper m=new ModelMapper();
        Asesoramientos a = m.map(dto,Asesoramientos.class);
        aS.update(a);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id) {
        aS.delete(id);
    }
}

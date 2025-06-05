package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.AsesoramientosDTO;
import pe.edu.upc.anonmusic.dtos.ComentariosDTO;
import pe.edu.upc.anonmusic.entities.Comentarios;
import pe.edu.upc.anonmusic.serviceinterfaces.IComentariosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comentarios")
public class ComentarioController {
    @Autowired
    private IComentariosService cS;

    @GetMapping("/listado")
    public List<ComentariosDTO> listar() {
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ComentariosDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody ComentariosDTO dto) {
        ModelMapper m=new ModelMapper();
        Comentarios c=m.map(dto,Comentarios.class);
        cS.post(c);
    }

    @GetMapping("/{id}")
    public ComentariosDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ComentariosDTO dto = m.map(cS.searchId(id), ComentariosDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody ComentariosDTO dto) {
        ModelMapper m=new ModelMapper();
        Comentarios c=m.map(dto,Comentarios.class);
        cS.update(c);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        cS.delete(id);
    }
}

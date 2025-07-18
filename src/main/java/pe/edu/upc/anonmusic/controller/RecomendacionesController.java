package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.RecomendacionesDTO;
import pe.edu.upc.anonmusic.entities.Recomendaciones;
import pe.edu.upc.anonmusic.serviceinterfaces.IRecomendacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Recomendaciones")
public class RecomendacionesController {
    @Autowired
    private IRecomendacionesService reS;

    @GetMapping("/listado")
    public List<RecomendacionesDTO> listar() {
        return reS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RecomendacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody RecomendacionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Recomendaciones rE =m.map(dto, Recomendaciones.class);
        reS.post(rE);
    }

    @GetMapping("/{id}")
    public RecomendacionesDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        RecomendacionesDTO dto = m.map(reS.searchId(id), RecomendacionesDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody RecomendacionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Recomendaciones rE=m.map(dto, Recomendaciones.class);
        reS.update(rE);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        reS.delete(id);
    }
}

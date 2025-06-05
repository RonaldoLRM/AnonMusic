package pe.edu.upc.anonmusic.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.ReaccionesDTO;
import pe.edu.upc.anonmusic.entities.Reacciones;
import pe.edu.upc.anonmusic.serviceinterfaces.IReaccionesService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reacciones")
public class ReaccionesController {
    @Autowired
    private IReaccionesService rS;

    @GetMapping("/listado")
    public List<ReaccionesDTO> listar() {
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReaccionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody ReaccionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Reacciones r=m.map(dto,Reacciones.class);
        rS.post(r);
    }

    @GetMapping("/{id}")
    public ReaccionesDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        ReaccionesDTO dto = m.map(rS.searchId(id), ReaccionesDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody ReaccionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Reacciones r=m.map(dto,Reacciones.class);
        rS.update(r);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        rS.delete(id);
    }
}

package pe.edu.upc.anonmusic.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.anonmusic.dtos.ReaccionesDTO;
import pe.edu.upc.anonmusic.serviceinterfaces.IReaccionesService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reacciones")
public class ReaccionesController {
    @Autowired
    private IReaccionesService rS;

    @GetMapping
    public List<ReaccionesDTO> listar() {
        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReaccionesDTO.class);
        }).collect(Collectors.toList());
    }
}

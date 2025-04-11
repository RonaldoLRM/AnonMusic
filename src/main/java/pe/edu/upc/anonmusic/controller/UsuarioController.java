package pe.edu.upc.anonmusic.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.anonmusic.dtos.UsuariosDTO;
import pe.edu.upc.anonmusic.serviceinterfaces.IUsuarioService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuariosDTO> listar() {
        return uS.list().stream().map(x->{
        ModelMapper m=new ModelMapper();
        return m.map(x,UsuariosDTO.class);
        }).collect(Collectors.toList());
    }
}

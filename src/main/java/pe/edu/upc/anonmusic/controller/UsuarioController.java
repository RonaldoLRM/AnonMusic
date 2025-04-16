package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.ReaccionesDTO;
import pe.edu.upc.anonmusic.dtos.UsuariosDTO;
import pe.edu.upc.anonmusic.entities.Reacciones;
import pe.edu.upc.anonmusic.entities.Usuarios;
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

    @PostMapping
    public void  agregar(@RequestBody UsuariosDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuarios u=m.map(dto,Usuarios.class);
        uS.post(u);
    }
    @PutMapping
    public void modificar(@RequestBody UsuariosDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuarios u=m.map(dto,Usuarios.class);
        uS.update(u);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        uS.delete(id);
    }
}

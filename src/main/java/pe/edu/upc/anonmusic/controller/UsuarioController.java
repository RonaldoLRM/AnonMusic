package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.UsuarioReaccionDTO;
import pe.edu.upc.anonmusic.dtos.UsuariosDTO;
import pe.edu.upc.anonmusic.entities.Usuarios;
import pe.edu.upc.anonmusic.serviceinterfaces.IUsuarioService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping("/listado")
    public List<UsuariosDTO> listar() {
        return uS.list().stream().map(x->{
        ModelMapper m=new ModelMapper();
        return m.map(x,UsuariosDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("{id}")
    public UsuariosDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UsuariosDTO dto = m.map(uS.searchId(id), UsuariosDTO.class);
        return dto;
    }

    @PostMapping("/registrar")
    public void  agregar(@RequestBody UsuariosDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuarios u=m.map(dto,Usuarios.class);
        uS.post(u);
    }
    @PutMapping("/modificar")
    public void modificar(@RequestBody UsuariosDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuarios u=m.map(dto,Usuarios.class);
        uS.update(u);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        uS.delete(id);
    }

    @GetMapping("/publicacionconmaslikes")
    public List<UsuarioReaccionDTO> usuarioconpublicacionconmaslikes(@RequestParam LocalDate fechaInicio,@RequestParam LocalDate fechafin) {
        List<String[]>lista=uS.UsuariosconPublicacionConMasLikes(fechaInicio, fechafin);
        List<UsuarioReaccionDTO> dtos=new ArrayList<>();
        for(String[] columna:lista) {
            UsuarioReaccionDTO dto=new UsuarioReaccionDTO();
            dto.setNombre(columna[0]);
            dto.setTipo(Integer.parseInt(columna[1]));
            dtos.add(dto);
        }
        return dtos;
    }
}

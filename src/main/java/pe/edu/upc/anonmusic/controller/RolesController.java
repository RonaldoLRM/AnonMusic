package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.NotificacionesDTO;
import pe.edu.upc.anonmusic.dtos.RolesDTO;
import pe.edu.upc.anonmusic.dtos.UsuariosPorRolDTO;
import pe.edu.upc.anonmusic.entities.Roles;
import pe.edu.upc.anonmusic.serviceinterfaces.IRolesService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RolesController {
    @Autowired
    private IRolesService roS;

    @GetMapping("/listado")
    public List<RolesDTO> listar(){
        return roS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,RolesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody RolesDTO dto){
        ModelMapper m = new ModelMapper();
        Roles r = m.map(dto,Roles.class);
        roS.post(r);
    }

    @GetMapping("/{id}")
    public RolesDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        RolesDTO dto = m.map(roS.searchId(id), RolesDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody RolesDTO dto){
        ModelMapper m = new ModelMapper();
        Roles r = m.map(dto,Roles.class);
        roS.update(r);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")int id){
        roS.delete(id);
    }

}

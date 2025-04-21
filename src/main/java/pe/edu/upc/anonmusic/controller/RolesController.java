package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.RolesDTO;
import pe.edu.upc.anonmusic.entities.Roles;
import pe.edu.upc.anonmusic.serviceinterfaces.IRolesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RolesController {
    @Autowired
    private IRolesService rS;

    @GetMapping("/listado")
    public List<RolesDTO> listar(){
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,RolesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody RolesDTO dto){
        ModelMapper m = new ModelMapper();
        Roles r = m.map(dto,Roles.class);
        rS.post(r);
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody RolesDTO dto){
        ModelMapper m = new ModelMapper();
        Roles r = m.map(dto,Roles.class);
        rS.update(r);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id")int id){
        rS.delete(id);
    }
}

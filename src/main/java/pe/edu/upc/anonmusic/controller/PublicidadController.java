package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.PublicacionesConMasComentariosDTO;
import pe.edu.upc.anonmusic.dtos.PublicidadDTO;
import pe.edu.upc.anonmusic.entities.Publicaciones;
import pe.edu.upc.anonmusic.serviceinterfaces.IPublicacionesService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicaciones")
public class PublicidadController {
    private static final Logger log = LoggerFactory.getLogger(PublicidadController.class);
    @Autowired
    private IPublicacionesService pS;

    @GetMapping("/listado")
    public List<PublicidadDTO> listar() {
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PublicidadDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrar")
    public void agregar(@RequestBody PublicidadDTO dto) {
        ModelMapper m=new ModelMapper();
        Publicaciones p=m.map(dto,Publicaciones.class);
        pS.post(p);
    }
    @PutMapping("/modificar")
    public void modificar(@RequestBody PublicidadDTO dto) {
        ModelMapper m=new ModelMapper();
        Publicaciones p=m.map(dto,Publicaciones.class);
        pS.update(p);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable("id") int id){
        pS.delete(id);
    }

    @GetMapping("/publicacionesconmascomentarios")
    public List<PublicacionesConMasComentariosDTO> publicacionesconmascomentarios(){
        List<String[]>Lista=pS.PublicacionesConMasComentarios();
        List<PublicacionesConMasComentariosDTO> dtos=new ArrayList<>();
        for(String[] columna:Lista){
            PublicacionesConMasComentariosDTO dto=new PublicacionesConMasComentariosDTO();
            dto.setIdPublicacion(Integer.parseInt(columna[0]));
            dto.setCantidadComentarios(Integer.parseInt(columna[1]));
            dtos.add(dto);
        }
        return dtos;
    }
}

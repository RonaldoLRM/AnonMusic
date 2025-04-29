package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.MusicaDTO;
import pe.edu.upc.anonmusic.dtos.UsuarioQ2DTO;
import pe.edu.upc.anonmusic.entities.Musica;
import pe.edu.upc.anonmusic.serviceinterfaces.IMusicaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Musica")
public class MusicaController {
    @Autowired
    private IMusicaService mS;

    @GetMapping("/listado")
    public List<MusicaDTO> listar(){
        return mS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x,MusicaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public MusicaDTO listarId(@PathVariable ("id")int id){
        ModelMapper m = new ModelMapper();
        MusicaDTO dto = m.map(mS.searchId(id),MusicaDTO.class);
        return dto;
    }

    @PostMapping("/registrar")
    public void agregar(@RequestBody MusicaDTO dto) {
        ModelMapper m = new ModelMapper();
        Musica mu = m.map(dto,Musica.class);
        mS.post(mu);
    }

    @PutMapping("/modificar")
    public void modificar(@RequestBody MusicaDTO dto) {
        ModelMapper m = new ModelMapper();
        Musica mu = m.map(dto,Musica.class);
        mS.update(mu);
    }

    @DeleteMapping("{id}")
    public void eliminar(@PathVariable ("id") int id) {
        mS.delete(id);
    }

    @GetMapping("/usuariossinasesoramientos")
    public List<UsuarioQ2DTO> usuariossinasesoramientos()
    {
        List<String[]>lista=mS.UsuariossinAsesoramientos();
        List<UsuarioQ2DTO> dtos=new ArrayList<>();
        for(String[] columna:lista) {
            UsuarioQ2DTO dto=new UsuarioQ2DTO();
            dto.setUsername(columna[0]);
            dto.setNombreMusica(columna[1]);
            dtos.add(dto);
        }
        return dtos;
    }
}

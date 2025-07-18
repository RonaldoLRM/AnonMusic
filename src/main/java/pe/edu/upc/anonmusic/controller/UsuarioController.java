package pe.edu.upc.anonmusic.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.anonmusic.dtos.*;
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

    @GetMapping("/lista")
    public List<Usuario2DTO> listaUsuarios() {
        {
            List<String[]> lista = uS.Listausuarios();
            List<Usuario2DTO> dtos = new ArrayList<>();
            for (String[] columna : lista) {
                Usuario2DTO dto = new Usuario2DTO();
                dto.setIdUsuario(Integer.parseInt(columna[0]));
                dto.setEmail(columna[1]);
                dto.setEnabled(Boolean.parseBoolean(columna[2].toString()));
                dto.setUsername(columna[3]);
                dtos.add(dto);
            }
            return dtos;
        }
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

    @GetMapping("/usuarioconpublicacionconmaslikes")
    public List<UsuarioReaccionDTO> usuarioconpublicacionconmaslikes(@RequestParam LocalDate fechaInicio,@RequestParam LocalDate fechafin) {
        List<String[]>lista=uS.UsuariosconPublicacionConMasLikes(fechaInicio, fechafin);
        List<UsuarioReaccionDTO> dtos=new ArrayList<>();
        for(String[] columna:lista) {
            UsuarioReaccionDTO dto=new UsuarioReaccionDTO();
            dto.setUsername(columna[0]);
            dto.setTipo(Integer.parseInt(columna[1]));
            dtos.add(dto);
        }
        return dtos;
    }
    @GetMapping("/usuariosconmasseguidores")
    public List<UsuarioConMasSeguidoresDTO> usuarioconmasseguidores()
    {
        List<String[]>lista=uS.UsuariosconMasSeguidores();
        List<UsuarioConMasSeguidoresDTO> dtos=new ArrayList<>();
        for(String[] columna:lista) {
            UsuarioConMasSeguidoresDTO dto=new UsuarioConMasSeguidoresDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setUsername(columna[1]);
            dto.setCorreo(columna[2]);
            dto.setTotalseguidores(Integer.parseInt(columna[3]));
            dtos.add(dto);
        }
        return dtos;
    }

    @GetMapping("/usuarioconplaylist")
    public List<UsuarioConPlaylistDTO> usuarioConPlaylist()
    {
        List<String[]>listas=uS.UsuarioconPlaylistCreadas();
        List<UsuarioConPlaylistDTO> dtos=new ArrayList<>();
        for(String[] columna:listas) {
            UsuarioConPlaylistDTO dto=new UsuarioConPlaylistDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setUsername(columna[1]);
            dto.setCantidad_playlist(Integer.parseInt(columna[2]));
            dtos.add(dto);
        }
        return dtos;
    }

    @GetMapping("/usuariosconmasmusicaanonima")
    public List<UsuariosConMasMusicaAnonimaDTO> usuariosConMasMusicaAnonima()
    {
        List<String[]>listas=uS.UsuariosconMasMusicaAnonima();
        List<UsuariosConMasMusicaAnonimaDTO> dtos=new ArrayList<>();
        for(String[] columna:listas) {
            UsuariosConMasMusicaAnonimaDTO dto=new UsuariosConMasMusicaAnonimaDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setUsername(columna[1]);
            dto.setTotal_musica_anonima(Integer.parseInt(columna[2]));
            dtos.add(dto);
        }
        return dtos;
    }

    @GetMapping("/usuariosconmasnotificacionesnoleidas")
    public List<UsuariosConMasNotificacionesNoLeidasDTO> usuariosConMasNotificacionesNoLeidas()
    {
        List<String[]>listas=uS.UsuariosconMasNotificacionesNoLeidas();
        List<UsuariosConMasNotificacionesNoLeidasDTO> dtos=new ArrayList<>();
        for(String[] columna:listas) {
            UsuariosConMasNotificacionesNoLeidasDTO dto=new UsuariosConMasNotificacionesNoLeidasDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setUsername(columna[1]);
            dto.setTotal_notificaciones_no_leidas(Integer.parseInt(columna[2]));
            dtos.add(dto);
        }
        return dtos;
    }
    @GetMapping("/usuariosconreaccionesmasnegativas")
    public List<UsuariosConMasReaccionesNegativasDTO> usuariosconreaccionesmasnegativas()
    {
        List<String[]>listas=uS.usuariosConMasReaccionesNegativas();
        List<UsuariosConMasReaccionesNegativasDTO> dtos=new ArrayList<>();
        for(String[] columna:listas) {
            UsuariosConMasReaccionesNegativasDTO dto=new UsuariosConMasReaccionesNegativasDTO();
            dto.setIdUsuario(Integer.parseInt(columna[0]));
            dto.setCantidadReacciones(Integer.parseInt(columna[1]));
            dtos.add(dto);
        }
        return dtos;
    }
}

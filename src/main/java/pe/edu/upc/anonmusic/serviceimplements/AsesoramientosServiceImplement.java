package pe.edu.upc.anonmusic.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.anonmusic.entities.Asesoramientos;
import pe.edu.upc.anonmusic.repositories.IAsesoramientosRepository;
import pe.edu.upc.anonmusic.serviceinterfaces.IAsesoramientosService;

import java.util.List;

@Service
public class AsesoramientosServiceImplement implements IAsesoramientosService {
    @Autowired
    private IAsesoramientosRepository aR;

    @Override
    public List<Asesoramientos> list(){
        return aR.findAll();
    }

    @Override
    public void post(Asesoramientos asesoramientos){
        aR.save(asesoramientos);
    }

    @Override
    public void update(Asesoramientos asesoramientos){
        aR.save(asesoramientos);
    }

    @Override
    public void delete(int id){
        aR.deleteById(id);
    }
}

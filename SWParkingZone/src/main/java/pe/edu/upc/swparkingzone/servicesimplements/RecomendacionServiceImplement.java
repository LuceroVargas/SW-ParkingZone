package pe.edu.upc.swparkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzone.entities.Recomendacion;
import pe.edu.upc.swparkingzone.repositories.IRecomendacionRepository;
import pe.edu.upc.swparkingzone.servicesinterfaces.IRecomendacionService;

import java.util.List;

@Service
public class RecomendacionServiceImplement implements IRecomendacionService {

    @Autowired
    private IRecomendacionRepository cR;

    @Override
    public List<Recomendacion> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Recomendacion rr) {
        cR.save(rr);
    }

    @Override
    public Recomendacion listId(int id) {
        return cR.findById(id).orElse(new Recomendacion());
    }

    @Override
    public void update(Recomendacion rr) {
        cR.save(rr);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }
}

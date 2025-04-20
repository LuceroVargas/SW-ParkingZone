package pe.edu.upc.swparkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzone.entities.Pagos;
import pe.edu.upc.swparkingzone.repositories.IPagosRepository;
import pe.edu.upc.swparkingzone.servicesinterfaces.IPagosService;

import java.util.List;
@Service
public class PagosServiceImplement implements IPagosService {

    @Autowired
    private IPagosRepository pR;

    @Override
    public List<Pagos> list() {return pR.findAll();}

    @Override
    public void insert(Pagos p) {pR.save(p);}

    @Override
    public Pagos listId(int idPago) {return pR.findById(idPago).orElse(new Pagos());}

    @Override
    public void update(Pagos p) {pR.save(p);}


    @Override
    public void delete(int idPago) {pR.deleteById(idPago);
    }


}

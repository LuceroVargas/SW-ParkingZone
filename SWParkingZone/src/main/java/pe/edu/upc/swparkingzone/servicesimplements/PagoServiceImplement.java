package pe.edu.upc.swparkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzone.entities.Pago;
import pe.edu.upc.swparkingzone.repositories.IPagoRepository;
import pe.edu.upc.swparkingzone.servicesinterfaces.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {
    @Autowired
    private IPagoRepository gR;
    @Override
    public List<Pago> list() {
        return gR.findAll();
    }

    @Override
    public void insert(Pago pg) {
        gR.save(pg);
    }

    @Override
    public Pago listId(int id) {
        return gR.findById(id).orElse(new Pago());
    }

    @Override
    public void update(Pago pg) {
        gR.save(pg);
    }

    @Override
    public void delete(int id) {
        gR.deleteById(id);
    }

    @Override
    public List<String[]> listarPagosConUsuarios() {
        return gR.listarPagosConUsuarios();
    }

    @Override
    public List<String[]> generarReporteMensualPagos() {
        return gR.generarReporteMensualPagos();
    }
}

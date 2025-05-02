package pe.edu.upc.swparkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzone.entities.Reserva;
import pe.edu.upc.swparkingzone.repositories.IReservaRepository;
import pe.edu.upc.swparkingzone.servicesinterfaces.IReservaService;

import java.util.List;

@Service
public class ReservaServiceImplement implements IReservaService {
    @Autowired
    private IReservaRepository vR;
    @Override
    public List<Reserva> list() {
        return vR.findAll();
    }

    @Override
    public void insert(Reserva rv) {
        vR.save(rv);
    }

    @Override
    public Reserva listId(int id) {
        return vR.findById(id).orElse(new Reserva());
    }

    @Override
    public void update(Reserva rv) {
        vR.save(rv);
    }

    @Override
    public void delete(int id) {
        vR.deleteById(id);
    }
}

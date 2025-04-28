package pe.edu.upc.swparkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzone.entities.Notificacion;
import pe.edu.upc.swparkingzone.repositories.INotificacionRepository;
import pe.edu.upc.swparkingzone.servicesinterfaces.INotificacionService;

import java.util.List;

@Service
public class NotificacionServiceImplement implements INotificacionService {

    @Autowired
    private INotificacionRepository nR;
    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void insert(Notificacion n) {
        nR.save(n);
    }

    @Override
    public Notificacion listId(int id) {
        return nR.findById(id).orElse(new Notificacion());
    }

    @Override
    public void update(Notificacion n) {
        nR.save(n);
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public List<String[]> listarHistorialNotificaciones() {
        return nR.listarHistorialNotificaciones();
    }
}

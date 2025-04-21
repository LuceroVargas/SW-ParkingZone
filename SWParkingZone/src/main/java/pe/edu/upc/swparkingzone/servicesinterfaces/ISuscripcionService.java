package pe.edu.upc.swparkingzone.servicesinterfaces;



import pe.edu.upc.swparkingzone.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {
    public List<Suscripcion> list();
    public void insert(Suscripcion sp);
    public Suscripcion ListId(int id);
    public void update(Suscripcion sp);
    public void delete(int id);
}

package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();
    public void insert(Notificacion n);
    public Notificacion listId(int id);
    public void update(Notificacion n);
    public void delete(int id);
}

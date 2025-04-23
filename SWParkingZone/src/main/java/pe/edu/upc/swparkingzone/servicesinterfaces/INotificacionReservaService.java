package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.NotificacionReserva;

import java.util.List;

public interface INotificacionReservaService {
    public List<NotificacionReserva> list();
    public void insert(NotificacionReserva notificacionReserva);
    public NotificacionReserva listId(int id);
    public void update(NotificacionReserva notificacionReserva);
    public void delete(int id);
}

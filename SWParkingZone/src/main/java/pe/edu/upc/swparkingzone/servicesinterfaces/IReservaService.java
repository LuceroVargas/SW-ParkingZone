package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Reserva;

import java.util.List;

public interface IReservaService {
    public List<Reserva> list();
    public void insert(Reserva rv);
    public  Reserva listId(int id);
    public void update(Reserva rv);
    public void delete(int id);
}

package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Reserva;

import java.util.List;

public interface IReservaService {

    public List<Reserva> list();
    public void insert(Reserva reserva);
    public Reserva listId(int id);
    public void update(Reserva reserva);
    public void delete(int id);
    public List<String[]> listarReservasPorUsuario();
    public List<String[]> listarReservasDuplicadas();
    public List<String[]> listarCantidadReservasActivasPorUsuario();
}

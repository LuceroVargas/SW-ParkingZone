package pe.edu.upc.swparkingzone.servicesinterfaces;


import pe.edu.upc.swparkingzone.entities.Pagos;

import java.util.List;

public interface IPagosService {
    public List<Pagos> list();
    public void insert(Pagos p);
    public Pagos listId(int idPago);
    public void update(Pagos p);
    public void delete(int idPago);

}

package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Recomendacion;

import java.util.List;

public interface IRecomendacionService {
    public List<Recomendacion> list();
    public void insert(Recomendacion rr);
    public Recomendacion listId(int id);
    public void update(Recomendacion rr);
    public void delete(int id);
}

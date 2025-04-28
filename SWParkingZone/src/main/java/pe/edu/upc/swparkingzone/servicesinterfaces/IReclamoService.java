package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Reclamo;

import java.util.List;

public interface IReclamoService {
    public List<Reclamo> list();
    public void insert(Reclamo rm);
    public Reclamo listId(int id);
    public void update(Reclamo rm);
    public void delete(int id);
    public List<String[]> listarReclamosUsuarios();
}

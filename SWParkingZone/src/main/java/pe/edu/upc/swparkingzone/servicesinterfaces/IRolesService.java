package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Roles;

import java.util.List;

public interface IRolesService {
    public List<Roles> list();
    public void insert(Roles r);
    public Roles listId(Long id);
    public void update(Roles r);
    public void delete(Long id);

}

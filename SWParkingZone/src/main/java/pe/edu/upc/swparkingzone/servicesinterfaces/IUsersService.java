package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.entities.Users;

import java.util.List;

public interface IUsersService {
    public List<Users> list();
    public void insert(Users u);
    public Users listId(long id);
    public void update(Users u);
    public void delete(long id);
    public List<Users> buscar(String username);
}

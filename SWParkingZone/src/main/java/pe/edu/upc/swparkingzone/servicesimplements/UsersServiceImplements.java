package pe.edu.upc.swparkingzone.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.swparkingzone.entities.Users;
import pe.edu.upc.swparkingzone.repositories.IUsersRepository;
import pe.edu.upc.swparkingzone.servicesinterfaces.IUsersService;

import java.util.List;

@Service
public class UsersServiceImplements implements IUsersService {
    @Autowired
    private IUsersRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users u) {
        uR.save(u);
    }

    @Override
    public Users listId(long id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public void update(Users u) {
        uR.save(u);
    }

    @Override
    public void delete(long id) {
        uR.deleteById(id);
    }

    @Override
    public List<Users> buscar(String username) {
        return uR.buscarNombre(username);
    }
}

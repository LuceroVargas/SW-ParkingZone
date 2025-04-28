package pe.edu.upc.swparkingzone.servicesinterfaces;

import pe.edu.upc.swparkingzone.dtos.EstacionamientoEmpresaDTO;
import pe.edu.upc.swparkingzone.entities.Estacionamiento;

import java.util.List;

public interface IEstacionamientoService {
    public List<Estacionamiento> list();
    public void insert(Estacionamiento e);
    public Estacionamiento listId(int id);
    public void update(Estacionamiento e);
    public void delete(int id);
    List<EstacionamientoEmpresaDTO> listarEstacionamientosConCantidadPorEmpresa();
}

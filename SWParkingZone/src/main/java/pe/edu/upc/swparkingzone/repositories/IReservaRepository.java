package pe.edu.upc.swparkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzone.entities.Reserva;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
}

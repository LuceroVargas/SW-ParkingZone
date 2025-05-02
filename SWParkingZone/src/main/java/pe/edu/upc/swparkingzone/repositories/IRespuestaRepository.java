package pe.edu.upc.swparkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzone.entities.Respuesta;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta, Integer> {

}

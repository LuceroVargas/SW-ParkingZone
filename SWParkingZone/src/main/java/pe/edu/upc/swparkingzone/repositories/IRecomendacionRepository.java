package pe.edu.upc.swparkingzone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.swparkingzone.entities.Recomendacion;

@Repository
public interface IRecomendacionRepository extends JpaRepository<Recomendacion, Integer> {
}

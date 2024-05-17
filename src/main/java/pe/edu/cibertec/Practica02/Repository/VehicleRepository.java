package pe.edu.cibertec.Practica02.Repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.Practica02.Entity.Vehiculo;

public interface VehicleRepository extends CrudRepository<Vehiculo,Integer> {
}

package pe.edu.cibertec.Practica02.Repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.Practica02.Entity.Usuario;

public interface UserRepository extends CrudRepository<Usuario,Integer> {

   Usuario findByusername(String username);
}

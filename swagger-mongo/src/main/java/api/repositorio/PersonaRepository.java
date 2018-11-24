
package api.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import api.modelo.Persona;

public interface PersonaRepository extends MongoRepository<Persona, String> {

	List<Persona> findByDni(@Param("dni") String dni);
	List<Persona> findByNombre(@Param("nombre") String nombre);
	List<Persona> findByApellido1(@Param("apellido1") String apellido1);
	List<Persona> findByApellido2(@Param("apellido2") String apellido2);
	List<Persona> deleteByDni(@Param("dni") String dni);
}

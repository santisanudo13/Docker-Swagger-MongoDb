
package api.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import api.modelo.Persona;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonaRepository extends MongoRepository<Persona, String> {

	List<Persona> findByDni(@Param("dni") String dni);
	List<Persona> findByNombre(@Param("nombre") String nombre);
	List<Persona> findByApellido1(@Param("apellido1") String apellido1);
	List<Persona> findByApellido2(@Param("apellido2") String apellido2);


}

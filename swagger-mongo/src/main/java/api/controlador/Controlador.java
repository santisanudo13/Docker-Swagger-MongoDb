package api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import api.modelo.Persona;
import api.repositorio.PersonaRepository;

@RestController
public class Controlador {
	
	@Autowired
	private PersonaRepository personaRepositorio;
	
	@GetMapping("/personas")
	public List<Persona> obtenTodasPersonas() {
		return personaRepositorio.findAll();
	}
	
	

}

package api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import api.modelo.Persona;
import api.repositorio.PersonaRepository;

@Controller
@RequestMapping("/personas")
public class ControladorPersonas {
	
	@Autowired
	private PersonaRepository personaRepositorio;
	
	@GetMapping({""})
	@ResponseBody
	public List<Persona> obtenTodasPersonas() {
		return personaRepositorio.findAll();
	}
	
	@GetMapping("/{dni}")
	@ResponseBody
	public List<Persona> obtenPersonasPorDni(@PathVariable("dni") String dni){
		return personaRepositorio.findByDni(dni);
	}
	
	@PostMapping("/nuevoUser")
	@ResponseBody
	public Persona obtenTodasPersonas(@RequestBody Persona persona) {
		return personaRepositorio.save(persona);
	}
	
	
	
	
	
	
	

}


package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import api.modelo.Persona;
import api.repositorio.PersonaRepository;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PersonaRepository personaRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");
		System.out.println("===================================================");

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===================================================");
		System.out.println("===================================================");
		
		personaRepositorio.deleteAll();

		System.out.println("===================================================");
		System.out.println("===================================================");
		
		// save a couple of customers
		personaRepositorio.save(new Persona("72185913e","Santiago","Sañudo","Martinez"));
		personaRepositorio.save(new Persona("dniPrueba","Santiago","Apellido1Prueba","Apellido2Prueba"));

		System.out.println("===================================================");
		System.out.println("===================================================");
		
		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Persona persona : personaRepositorio.findAll()) {
			System.out.println(persona);
		}
		System.out.println();

		System.out.println("===================================================");
		System.out.println("===================================================");
		
		// fetch an individual customer
		System.out.println("Customer found with findByDni('72185013e'):");
		System.out.println("--------------------------------");
		System.out.println(personaRepositorio.findByDni("72185013e"));

		System.out.println("===================================================");
		System.out.println("===================================================");
		
		System.out.println("Customers found with findByNombre('Santiago'):");
		System.out.println("--------------------------------");
		for (Persona customer : personaRepositorio.findByNombre("Santiago")) {
			System.out.println(customer);
		}
		System.out.println("===================================================");
		System.out.println("===================================================");
		
		
		System.out.println("Customers found with findByApellido1('Sañudo'):");
		System.out.println("--------------------------------");
		for (Persona customer : personaRepositorio.findByApellido1("Sañudo")) {
			System.out.println(customer);
		}
		System.out.println("===================================================");
		System.out.println("===================================================");

	}
}

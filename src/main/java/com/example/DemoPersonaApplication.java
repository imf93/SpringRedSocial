package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoPersonaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoPersonaApplication.class, args);

		//PersonaService personaService=context.getBean(PersonaService.class);

		//personaService.testPersonas();

		SocialNetworkService socialNetworkService = context.getBean(SocialNetworkService.class);


		Persona ivan = new Persona();
		ivan.setNombre("Ivan");
		ivan.setEdad(23);

		Persona dimple = new Persona();
		dimple.setNombre("Dimple");
		dimple.setEdad(25);

		Persona novia = new Persona();
		novia.setNombre("novia");
		novia.setEdad(23);


		socialNetworkService.añadirPersona(ivan);
		socialNetworkService.añadirPersona(dimple);
		socialNetworkService.añadirPersona(novia);

		socialNetworkService.añadirPareja(ivan, novia);


		System.out.println("La pareja de Ivan es : ");
		System.out.println(socialNetworkService.getPareja(ivan));
	}
}

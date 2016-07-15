package com.example.service;

import com.example.domain.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoPersonaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DemoPersonaApplication.class, args);


		SocialNetworkService socialNetworkService = context.getBean(SocialNetworkService.class);


		testSocialNetwork(socialNetworkService);
	}

	private static void testSocialNetwork(SocialNetworkService socialNetworkService) {
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

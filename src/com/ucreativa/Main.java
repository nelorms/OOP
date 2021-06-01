package com.ucreativa;

import com.ucreativa.familia.Francisco;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

public class Main {

    public static void main(String[] args) {
	    Francisco papa = new Francisco("hola");
		int edad = papa.getAge();
		System.out.println("Edad: " + edad);
	    papa.setCumple();
		edad = papa.getAge();
		System.out.println("I love " + papa.getHobby());
	    System.out.println("Bye Class: " + edad);


		Persona francisco = new Persona("Francisco", "1231231213", 50, false);
		francisco.vacunar();

		Amigo emel = new Amigo("Emel", "123123123", 50, false, "amigo", "facebook");
		emel.vacunar();

		Familiar nela = new Familiar("Nela", "a1231231", 12, false, "hija");
		nela.vacunar();
    }
}

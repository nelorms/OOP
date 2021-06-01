package com.ucreativa;

import com.ucreativa.familia.Francisco;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Francisco papa = new Francisco("hola");
		int edad = papa.getAge();
		System.out.println("Edad: " + edad);
	    papa.setCumple();
		edad = papa.getAge();
		System.out.println("I love " + papa.getHobby());
	    System.out.println("Bye Class: " + edad);


		Persona papa = new Persona("Francisco", "1231231213", 50, false);
		Amigo amigo = new Amigo("Josue", "123123123", 50, false, "amigo", "facebook");
		Familiar hija = new Familiar("Nela", "1231231", 12, false, "hija");

		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(papa);
		listaPersonas.add(amigo);
		listaPersonas.add(hija);

		List<BitacoraVacunas> bitacora = new ArrayList<>();
		bitacora.add(new BitacoraVacunas(papa, "Pfizer", new Date()));
		bitacora.add(new BitacoraVacunas(amigo, "astra", new Date()));
		bitacora.add(new BitacoraVacunas(hija, "Johnson", new Date()));
    }
}


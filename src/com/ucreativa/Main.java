package com.ucreativa;
import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;

import java.util.ArrayList;
import java.util.Date;

/*
public class Main {

    public static void main(String[] args) {
	    Francisco papa = new Francisco("hola");
		int edad = papa.getAge();
		System.out.println("Edad: " + edad);
	    papa.setCumple();
		edad = papa.getAge();
		System.out.println("I love " + papa.getHobby());
	    System.out.println("Bye Class: " + edad);


		Persona papa1 = new Persona("Francisco", "1231231213", 50, false);
		Amigo amigo = new Amigo("Josue", "123123123", 50, false, "amigo", "facebook");
		Familiar hija = new Familiar("Nela", "1231231", 12, false, "hija");

		List<Persona> listaPersonas = new ArrayList<>();
		listaPersonas.add(papa1);
		listaPersonas.add(amigo);
		listaPersonas.add(hija);

		List<BitacoraVacunas> bitacora = new ArrayList<>();
		bitacora.add(new BitacoraVacunas(papa1, "Pfizer", new Date()));
		bitacora.add(new BitacoraVacunas(amigo, "astra", new Date()));
		bitacora.add(new BitacoraVacunas(hija, "Johnson", new Date()));
    }
}*/

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<BitacoraVacunas> db = new ArrayList<>();

		String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;
		Persona persona;
		System.out.println("Nombre:");
		nombre = in.nextLine();
		System.out.println("Cedula:");
		cedula = in.nextLine();
		System.out.println("Edad:");
		edad = in.nextLine();
		System.out.println("Riesgo(S/N:");
		riesgo = in.nextLine();
		System.out.println("Amigo(A)/Familiar(F):");
		isAmigo = in.nextLine();
		if (isAmigo.equals("A")) {
			System.out.println("Relacion:");
			relacion = in.nextLine();
			System.out.println("Facebook:");
			facebook = in.nextLine();
			persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
		}
		else {
			System.out.println("Parentesco:");
			parentesco = in.nextLine();
			persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);
		}
		System.out.println("Vacuna -- Marca");
		marca = in.nextLine();

		db.add(new BitacoraVacunas(persona, marca, new Date()));

		System.out.println("Quiero imprimir Lista (Y)");
		String print = in.nextLine();
		if (print.equals("Y")){

			for (BitacoraVacunas item : db){
				System.out.println(item.getPersona().getNombre() + "vacunado el " + item.getfecha());
			}
		}
	}
}


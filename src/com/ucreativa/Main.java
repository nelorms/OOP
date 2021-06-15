package com.ucreativa;

import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		BitacoraService service = new BitacoraService(new FileRepository());
		String nombre, cedula, edad, riesgo, isAmigo, relacion = "", facebook = "", parentesco = "", marca;
		Persona persona;
		while(true) {
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
			} else {
				System.out.println("Parentesco:");
				parentesco = in.nextLine();
			}
			System.out.println("Vacuna -- Marca");
			marca = in.nextLine();

			service.save(nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca);

			System.out.println("Quiero imprimir Lista (Y)");
			String print = in.nextLine();
			if (print.equals("Y")) {
				for (String item : service.get()) {
					System.out.println(item);
				}
			}
		}
	}
}


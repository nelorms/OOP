package com.ucreativa;

import com.ucreativa.familia.Francisco;

public class Main {

    public static void main(String[] args) {
	    Francisco papa = new Francisco("hola");
		int edad = papa.getAge();
		System.out.println("Edad: " + edad);
	    papa.setCumple();
		edad = papa.getAge();
		System.out.println("I love " + papa.getHobby());
	    System.out.println("Bye Class: " + edad);
    }
}

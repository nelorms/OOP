package com.ucreativa.vacunacion;

public class Persona {
    private String nombre;
    private String cedula;
    private int edad;
    private boolean riesgo;

    public Persona(String nombre, String cedula, int edad, boolean riesgo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.riesgo = riesgo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getCedula(){
        return this.cedula;
    }
    public int getEdad(){
        return this.edad;
    }
    public boolean getRiesgo(){
        return this.riesgo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setRiesto(boolean riesgo){
        this.riesgo = riesgo;
    }
}
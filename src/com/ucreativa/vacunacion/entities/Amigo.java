package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona {
    private String relacion;
    private String facebook;

    public Amigo(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebook){
        super(nombre, cedula, edad, riesgo);
        this.facebook = facebook;
        this.relacion = relacion;
    }

    public String getRelacion(){
        return this.relacion;
    }
    public String getFacebook(){
        return this.facebook;
    }
}

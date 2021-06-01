package com.ucreativa.vacunacion.entities;

import com.ucreativa.vacunacion.entities.Persona;

import java.util.Date;

public class BitacoraVacunas {

    private Persona persona;
    private String marca;
    private Date fecha;


    public BitacoraVacunas(Persona persona, String marca, Date fecha) {
        this.persona = persona;
        this.marca = marca;
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getmarca() {
        return marca;
    }

    public Date getfecha() {
        return fecha;
    }
}

package com.ucreativa.vacunacion.ui;

public class ErrorEnEdadException extends Exception{

    public ErrorEnEdadException(String edad) { super("La edad está incorrecta " + edad);
    }
}

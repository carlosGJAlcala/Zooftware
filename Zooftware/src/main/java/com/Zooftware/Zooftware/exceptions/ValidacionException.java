package com.Zooftware.Zooftware.exceptions;

public class ValidacionException extends RuntimeException{

    public ValidacionException(){
        super("El usuario o la contrasena son incorrectos, inténtelo de nuevo");
    }
}

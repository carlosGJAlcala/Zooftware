package com.Zooftware.Zooftware.exceptions;

public class PersonaNotFoundException  extends RuntimeException{
    public PersonaNotFoundException(String mensaje){
        super(mensaje);
    }
}

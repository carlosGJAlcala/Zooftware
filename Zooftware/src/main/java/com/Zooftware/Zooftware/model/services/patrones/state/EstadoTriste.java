package com.Zooftware.Zooftware.model.services.patrones.state;

public class EstadoTriste implements Estado  {

    @Override
    public void ejecutar(Animal t) {
        System.out.println("¡Estoy triste!");

    }
}

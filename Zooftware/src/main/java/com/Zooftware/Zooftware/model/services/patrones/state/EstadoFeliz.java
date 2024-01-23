package com.Zooftware.Zooftware.model.services.patrones.state;

public class EstadoFeliz implements Estado {



    @Override
    public void ejecutar(Animal t) {
        System.out.println("¡Estoy feliz!");
    }
}

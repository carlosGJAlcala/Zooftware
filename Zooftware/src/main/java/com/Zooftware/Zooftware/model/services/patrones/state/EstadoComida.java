package com.Zooftware.Zooftware.model.services.patrones.state;

import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;

public class EstadoComida implements Estado {
    @Override
    public void ejecutar(Animal t) {
        Estado feliz = new EstadoFeliz();
        Estado triste = new EstadoTriste();
        System.out.println("Estado Comida: " + t.toString());
        if (t.getHambre() >= 50 && t.getHambre() <= 100) {
            System.out.println("¡No tengo hambre!");
            t.setEstadoAnimal(EstadoAnimal.FELIZ);
            t.setEstadoActual(feliz);
        } else if (t.getHambre() >= 0 && t.getHambre() < 50) {
            System.out.println("¡Tengo hambre!");
            t.setEstadoActual(triste);
            t.setEstadoAnimal(EstadoAnimal.TRISTE);
        }
    }


}

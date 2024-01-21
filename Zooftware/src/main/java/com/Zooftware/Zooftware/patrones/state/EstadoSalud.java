package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;

public class EstadoSalud implements Estado {



    @Override
    public void ejecutar(Animal t) {
        Estado feliz = new EstadoFeliz();
        Estado triste = new EstadoTriste();
        System.out.println("Estado Salud: " + t.toString());
        if (t.getSalud() >= 50 && t.getSalud() <= 100) {
            System.out.println("¡Tengo una buena salud!");
            t.setEstadoAnimal(EstadoAnimal.FELIZ);
            t.setEstadoActual(feliz);
        } else if (t.getSalud() >= 0 && t.getSalud() < 50) {
            System.out.println("¡Estoy enfermo!");
            t.setEstadoActual(triste);
            t.setEstadoAnimal(EstadoAnimal.TRISTE);
        }
    }
}

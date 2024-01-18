package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

public class EstadoComida implements Estado {
    @Override
    public void ejecutar(Animal t) {
        Estado feliz = new EstadoFeliz();
        Estado triste = new EstadoTriste();
        System.out.println("Estado Comida: " + t.toString());
        if (t.getComida() >= 50 && t.getComida() <= 100) {
            System.out.println("¡No tengo hambre!");
            t.setEstadoActual(feliz);
        } else if (t.getComida() >= 0 && t.getComida() < 50) {
            System.out.println("¡Tengo hambre!");
            t.setEstadoActual(triste);
        }
    }


}

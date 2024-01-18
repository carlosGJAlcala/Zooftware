package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

public class EstadoSuenio implements Estado{
    @Override
    public void ejecutar(Animal t) {

        Estado feliz = new EstadoFeliz();
        Estado triste = new EstadoTriste();
        System.out.println("Estado Sueño: " + t.toString());
        if (t.getSuenio() >= 50 && t.getSuenio() <= 100) {
            System.out.println("¡Tengo sueño!");
            t.setEstadoActual(triste);
        } else if (t.getSuenio() >= 0 && t.getSuenio() < 50) {
            System.out.println("¡Estoy despierto!");
            t.setEstadoActual(feliz);

        }
    }
}

package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

public class EstadoTriste implements Estado  {

    @Override
    public void ejecutar(AnimalEntityDto t) {
        System.out.println("¡Estoy triste!");

    }
}

package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

public class EstadoFeliz implements Estado {



    @Override
    public void ejecutar(AnimalEntityDto t) {
        System.out.println("¡Estoy feliz!");
    }
}

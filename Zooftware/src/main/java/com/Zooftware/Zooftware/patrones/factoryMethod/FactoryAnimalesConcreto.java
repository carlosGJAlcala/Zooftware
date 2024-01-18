package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;

public class FactoryAnimalesConcreto implements FactoryMethodAnimal {


    @Override
    public AnimalEntityDto crearAnimalAcuatico() {
        AnimalEntityDto animal=new AnimalEntityDto("Pez Remo", EstadoAnimal.FELIZ, TipoAnimal.ACUATICO,1);
        return  animal;
    }

    @Override
    public AnimalEntityDto crearAnimalAnfibio() {
        return null;
    }

    @Override
    public AnimalEntityDto crearAnimalTerrestre() {
        return null;
    }
}

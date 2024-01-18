package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

public interface FactoryMethodAnimal {
        AnimalEntityDto crearAnimalAcuatico();
        AnimalEntityDto crearAnimalAnfibio();
        AnimalEntityDto crearAnimalTerrestre();
}

package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;

public interface FactoryMethodAnimal {
        AnimalEntityDto crearAnimalAcuaticoAguaDulce();
        AnimalEntityDto crearAnimalAcuaticoAguaSalada();
        AnimalEntityDto crearAnimalAnfibio();
        AnimalEntityDto crearAnimalTerrestre();

        PlantaEntityDto plantaAcuaticaAguaSalada();
        PlantaEntityDto plantaAcuaticaAguaDulce();
        PlantaEntityDto plantaAnfibia();
        PlantaEntityDto plantaTerrestre();
}

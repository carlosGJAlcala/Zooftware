package com.Zooftware.Zooftware.model.services.patrones.factoryMethod;

import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;

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

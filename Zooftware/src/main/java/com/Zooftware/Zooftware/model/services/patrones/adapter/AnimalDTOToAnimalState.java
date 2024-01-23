package com.Zooftware.Zooftware.model.services.patrones.adapter;

import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.services.patrones.state.Animal;

public class AnimalDTOToAnimalState extends Animal {

    public AnimalDTOToAnimalState(AnimalEntityDto animalEntityDto) {
        super(animalEntityDto.getId() ,animalEntityDto.getNombre(), animalEntityDto.getEstadoAnimal(), animalEntityDto.getTipo(), animalEntityDto.getNumExtremidades(), animalEntityDto.getSalud(), animalEntityDto.getSed(),
                animalEntityDto.getSuenio(), animalEntityDto.getHambre());
    }
}

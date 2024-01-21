package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import com.Zooftware.Zooftware.patrones.state.Animal;
import com.Zooftware.Zooftware.patrones.state.Estado;

public class AnimalDTOToAnimalState extends Animal {

    public AnimalDTOToAnimalState(AnimalEntityDto animalEntityDto) {
        super(animalEntityDto.getId() ,animalEntityDto.getNombre(), animalEntityDto.getEstadoAnimal(), animalEntityDto.getTipo(), animalEntityDto.getNumExtremidades(), animalEntityDto.getSalud(), animalEntityDto.getSed(),
                animalEntityDto.getSuenio(), animalEntityDto.getHambre());
    }
}

package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import org.springframework.stereotype.Component;


public class AnimalJsonToDTo  extends AnimalEntityDto {
    AnimalJson animalJson;
    private int id_habita;
    public AnimalJsonToDTo(AnimalJson animalJson) {
        this.animalJson = animalJson;

       ;
        this.setNombre(animalJson.getNombre());
        this.setId(0);
        this.setHambre(20);
        this.setSuenio(20);
        this.setSalud(20);
        this.setSed(getSed());
        this.setEstadoAnimal(animalJson.getEstadoAnimal());
        this.setTipo(animalJson.getTipo());
        this.setNumExtremidades(4);
        this.id_habita=animalJson.getId_habita();

    }

    public int getId_habita() {
        return id_habita;
    }
}

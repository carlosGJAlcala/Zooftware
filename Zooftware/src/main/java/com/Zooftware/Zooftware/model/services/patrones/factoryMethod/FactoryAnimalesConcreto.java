package com.Zooftware.Zooftware.model.services.patrones.factoryMethod;

import com.Zooftware.Zooftware.model.dao.organismos.AnimalDAOImp;
import com.Zooftware.Zooftware.model.dao.organismos.IAnimalDAO;
import com.Zooftware.Zooftware.model.dao.organismos.IPlantaDAO;
import com.Zooftware.Zooftware.model.dao.organismos.PlantaDAOImp;
import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;
import com.Zooftware.Zooftware.model.entities.enums.TipoAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactoryAnimalesConcreto implements FactoryMethodAnimal {

    IAnimalDAO animalDAO = new AnimalDAOImp();

    @Autowired
    IPlantaDAO plantaDAO = new PlantaDAOImp();

    @Override
    public AnimalEntityDto crearAnimalAcuaticoAguaSalada() {
        AnimalEntityDto animal = new AnimalEntityDto("Pez Remo", EstadoAnimal.TRISTE, TipoAnimal.ACUATICO, null, 4, 20, 20, 20, 20);
        return animal;
    }

    @Override
    public AnimalEntityDto crearAnimalAcuaticoAguaDulce() {
        AnimalEntityDto animal = new AnimalEntityDto("Pirania", EstadoAnimal.TRISTE, TipoAnimal.ACUATICO, null, 4, 20, 20, 20, 20);
        return animal;
    }

    @Override
    public AnimalEntityDto crearAnimalAnfibio() {
        AnimalEntityDto animal = new AnimalEntityDto("Cocodrilo", EstadoAnimal.TRISTE, TipoAnimal.ANFIBIO, null, 4, 20, 20, 20, 20);
        return animal;
    }

    @Override
    public AnimalEntityDto crearAnimalTerrestre() {
        AnimalEntityDto animal = new AnimalEntityDto("Elefante", EstadoAnimal.TRISTE, TipoAnimal.TERRESTRE, null, 4, 20, 20, 20, 20);

        return animal;
    }

    @Override
    public PlantaEntityDto plantaAcuaticaAguaDulce() {
        PlantaEntityDto planta = new PlantaEntityDto("Cola de Zorro");

        return planta;
    }

    @Override
    public PlantaEntityDto plantaAcuaticaAguaSalada() {
        PlantaEntityDto planta = new PlantaEntityDto("Alga Kelp");

        return planta;
    }

    @Override
    public PlantaEntityDto plantaAnfibia() {
        PlantaEntityDto planta = new PlantaEntityDto("Helecho");

        return planta;
    }

    @Override
    public PlantaEntityDto plantaTerrestre() {
        PlantaEntityDto planta = new PlantaEntityDto("Olmo");
        //plantaDAO.guardarPlanta(planta);

        return planta;
    }
}

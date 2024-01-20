package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelDAO.AnimalDAOImp;
import com.Zooftware.Zooftware.modelDAO.IAnimalDAO;
import com.Zooftware.Zooftware.modelDAO.IPlantaDAO;
import com.Zooftware.Zooftware.modelDAO.PlantaDAOImp;
import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FactoryAnimalesConcreto implements FactoryMethodAnimal {

    IAnimalDAO animalDAO =new AnimalDAOImp();

    @Autowired
    IPlantaDAO plantaDAO = new PlantaDAOImp();

    @Override
    public AnimalEntityDto crearAnimalAcuaticoAguaSalada() {
        AnimalEntityDto animal=new AnimalEntityDto("Pez Remo", EstadoAnimal.FELIZ, TipoAnimal.ACUATICO);
        animalDAO.guardarAnimal(animal);
        return  animal;
    }
    @Override
    public AnimalEntityDto crearAnimalAcuaticoAguaDulce() {
        AnimalEntityDto animal=new AnimalEntityDto("Raya Gigante", EstadoAnimal.FELIZ, TipoAnimal.ACUATICO);
        animalDAO.guardarAnimal(animal);
        return  animal;
    }

    @Override
    public AnimalEntityDto crearAnimalAnfibio() {
        AnimalEntityDto animal=new AnimalEntityDto("Ajolote", EstadoAnimal.FELIZ, TipoAnimal.ANFIBIO);
        //animalDAO.guardarAnimal(animal);

        return animal;
    }

    @Override
    public AnimalEntityDto crearAnimalTerrestre() {
        AnimalEntityDto animal=new AnimalEntityDto("Elefante", EstadoAnimal.FELIZ, TipoAnimal.TERRESTRE);
        animalDAO.guardarAnimal(animal);

        return animal;
    }

    @Override
    public PlantaEntityDto plantaAcuaticaAguaDulce() {
        PlantaEntityDto planta=new PlantaEntityDto("Cola de Zorro");
        plantaDAO.guardarPlanta(planta);

        return planta;
    }
    @Override
    public PlantaEntityDto plantaAcuaticaAguaSalada() {
        PlantaEntityDto planta=new PlantaEntityDto("Alga Kelp");
        plantaDAO.guardarPlanta(planta);

        return planta;
    }
    @Override
    public PlantaEntityDto plantaAnfibia() {
        PlantaEntityDto planta=new PlantaEntityDto("Manglar");
        plantaDAO.guardarPlanta(planta);

        return planta;
    }

    @Override
    public PlantaEntityDto plantaTerrestre() {
        PlantaEntityDto planta=new PlantaEntityDto("Pino");
        plantaDAO.guardarPlanta(planta);

        return planta;
    }
}

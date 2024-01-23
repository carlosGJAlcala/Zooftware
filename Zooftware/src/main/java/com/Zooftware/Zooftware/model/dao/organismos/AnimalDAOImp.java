package com.Zooftware.Zooftware.model.dao.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;
import com.Zooftware.Zooftware.model.entities.instalaciones.HabitatEntity;
import com.Zooftware.Zooftware.model.entities.organimos.AnimalEntity;
import com.Zooftware.Zooftware.model.services.patrones.state.Animal;
import com.Zooftware.Zooftware.model.repository.AnimalEntityRepository;
import com.Zooftware.Zooftware.model.repository.HabitatEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AnimalDAOImp implements  IAnimalDAO{
    @Autowired
    AnimalEntityRepository animalJPA;
    AnimalEntityMapper animalEntityMapper;

    @Autowired
    HabitatEntityRepository habitatJPA;

    @Override
    public AnimalEntityDto buscarPorId(Integer id) {
        Optional<AnimalEntity> optional = animalJPA.findById(id);
        if (optional.isPresent()) {
            return animalEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public List<AnimalEntityDto> buscarPorNombre(String nombre) {
        List<AnimalEntity> listaBuscarNombre = animalJPA.findByNombre(nombre);

        return listaBuscarNombre.stream().map(animalEntityMapper.mapper::toDto).collect(Collectors.toList());

    }

    @Override
    public List<AnimalEntityDto> buscarPorEstado(EstadoAnimal estado) {
        List<AnimalEntity> listaEstado = animalJPA.findByEstadoAnimal(estado);
        return listaEstado.stream().map(animalEntityMapper.mapper::toDto).collect(Collectors.toList());

    }

    @Override
    public List<AnimalEntityDto> buscarPorTipo(String estadoAnimal) {
        List<AnimalEntity> listaTipoAnimal = animalJPA.findByTipo(estadoAnimal);

        return listaTipoAnimal.stream().map(animalEntityMapper.mapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void guardarAnimal(AnimalEntityDto animal) {
        AnimalEntity animalEntity=animalEntityMapper.mapper.toEntity(animal);
        animalJPA.save(animalEntity);
    }
    @Override
    public List<AnimalEntityDto> verAnimales(){
        List<AnimalEntity> animalesentity=  animalJPA.findAll();
        List<AnimalEntityDto> animales = new ArrayList<>();

        for(AnimalEntity animal: animalesentity){
            AnimalEntityDto animalDto = buscarPorId(animal.getId());
            animales.add(animalDto);
        }
         return animales;
    }
/*
    public List<AnimalEntity> verAnimales(){
    List<AnimalEntity> resultados = animalJPA.findAll();
        StringBuilder  stringBuilder = new StringBuilder();
        for(AnimalEntity animal:resultados){
            stringBuilder.append(animal.toString()).append("\n");
        }
        System.out.println(stringBuilder.toString());
        return animalJPA.findAll();

    }
 */
    @Override
    public List<AnimalEntityDto> verAnimalesPorHabita(int habita_id) {
        List<AnimalEntity> animalesentity=  animalJPA.findByHabitat_Id(habita_id);
        List<AnimalEntityDto> animales = new ArrayList<>();

        for(AnimalEntity animal: animalesentity){
            AnimalEntityDto animalDto = buscarPorId(animal.getId());
            animales.add(animalDto);
        }
        return animales;    
    }

    @Override
    public void eliminarAnimalPorId(int id) {
        animalJPA.deleteById(id);
    }

    @Override
    public void actualizarAnimal(AnimalEntityDto animal) {
        AnimalEntity animalEntity=animalEntityMapper.mapper.toEntity(animal);
        animalJPA.save(animalEntity);
    }

    @Override
    public void actualizarAnimalEstado(AnimalEntityDto animal) {
//        animalJPA.deleteById( ((Animal)animal).getIdent()  );
//
//        animalJPA.
        AnimalEntity animalEntity=animalEntityMapper.mapper.toEntity(animal);
        animalEntity.setId( ((Animal)animal).getIdent());


        Optional<AnimalEntity> animalEntityHabitat = animalJPA.findById(animalEntity.getId());
        Optional<HabitatEntity> habitat = habitatJPA.findById(animalEntityHabitat.get().getHabitat().getId());

        animalEntity.setHabitat(habitat.get());

        animalJPA.save(animalEntity);
    }
}

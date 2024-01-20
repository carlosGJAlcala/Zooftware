package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.repository.AnimalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AnimalDAOImp implements  IAnimalDAO{
    @Autowired
    AnimalEntityRepository animalJPA;
    AnimalEntityMapper animalEntityMapper;

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

    public List<AnimalEntityDto> verAnimales(){
        List<AnimalEntity> animalesentity=  animalJPA.findAll();
        List<AnimalEntityDto> animalEntityDtoList =animalesentity.stream().map(animalEntityMapper::toDto).collect(Collectors.toList());
        return animalEntityDtoList;
    }

    @Override
    public void eliminarAnimalPorId(int id) {
        animalJPA.deleteById(id);
    }

    @Override
    public void actualizarAnimal(AnimalEntityDto animal) {
        animalJPA.deleteById(animal.getId());
        AnimalEntity clienteEntity=animalEntityMapper.mapper.toEntity(animal);
        animalJPA.save(clienteEntity);
    }
}

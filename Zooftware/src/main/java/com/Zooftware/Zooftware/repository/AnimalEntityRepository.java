package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnimalEntityRepository extends JpaRepository<AnimalEntity, Integer> {


    @Override
    Optional<AnimalEntity> findById(Integer integer);

    List<AnimalEntity> findByNombre(String nombre);

    List<AnimalEntity> findByEstadoAnimal(Object estadoAnimal);




}
package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnimalEntityRepository extends JpaRepository<AnimalEntity, Integer> {

    @Override
    Optional<AnimalEntity> findById(Integer integer);
    List<AnimalEntity> findAll();

    List<AnimalEntity> findByNombre(String nombre);

    List<AnimalEntity> findByEstadoAnimal(EstadoAnimal estadoAnimal);

    List<AnimalEntity> findByTipo(String tipo);


}
package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.organimos.PlantaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlantaEntityRepository extends JpaRepository<PlantaEntity, Integer> {

    @Override
    Optional<PlantaEntity> findById(Integer integer);

    List<PlantaEntity> findByHabitat_Id(Integer integer);


}
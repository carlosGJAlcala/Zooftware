package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.PlantaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlantaEntityRepository extends JpaRepository<PlantaEntity, Integer> {

    @Override
    Optional<PlantaEntity> findById(Integer integer);

    List<PlantaEntity> findBySueloId(Integer sueloId);

}
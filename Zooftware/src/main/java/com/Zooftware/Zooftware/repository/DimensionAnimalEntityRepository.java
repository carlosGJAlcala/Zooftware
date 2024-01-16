package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DimensionAnimalEntityRepository extends JpaRepository<DimensionAnimalEntity, Integer> {


    @Override
    Optional<DimensionAnimalEntity> findById(Integer integer);




}
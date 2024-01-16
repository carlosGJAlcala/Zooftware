package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.DimensionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DimensionEntityRepository extends JpaRepository<DimensionEntity, Integer> {

    @Override
    Optional<DimensionEntity> findById(Integer integer);
}
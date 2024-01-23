package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.instalaciones.TerrestreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TerrestreEntityRepository extends JpaRepository<TerrestreEntity, Integer> {

    @Override
    Optional<TerrestreEntity> findById(Integer integer);
}
package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.TerrestreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TerrestreEntityRepository extends JpaRepository<TerrestreEntity, Integer> {

    @Override
    Optional<TerrestreEntity> findById(Integer integer);
}
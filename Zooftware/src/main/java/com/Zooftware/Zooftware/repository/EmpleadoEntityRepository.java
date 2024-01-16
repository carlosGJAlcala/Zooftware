package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoEntityRepository extends JpaRepository<EmpleadoEntity, Integer> {

    @Override
    Optional<EmpleadoEntity> findById(Integer integer);

}
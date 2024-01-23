package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.persona.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpleadoEntityRepository extends JpaRepository<EmpleadoEntity, Integer> {

    @Override
    Optional<EmpleadoEntity> findById(Integer integer);

    EmpleadoEntity findByUsername(String username);
}
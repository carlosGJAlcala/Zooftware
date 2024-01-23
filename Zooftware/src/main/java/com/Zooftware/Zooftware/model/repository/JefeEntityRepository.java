package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.persona.JefeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JefeEntityRepository extends JpaRepository<JefeEntity, Integer> {


    @Override
    Optional<JefeEntity> findById(Integer integer);

    JefeEntity findByUsername(String username);
}
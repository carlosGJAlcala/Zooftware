package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.persona.JefeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JefeEntityRepository extends JpaRepository<JefeEntity, Integer> {


    @Override
    Optional<JefeEntity> findById(Integer integer);
}
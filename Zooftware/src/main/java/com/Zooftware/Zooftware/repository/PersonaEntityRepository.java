package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaEntityRepository extends JpaRepository<PersonaEntity, Integer> {


    @Override
    Optional<PersonaEntity> findById(Integer integer);


}
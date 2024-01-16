package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.SueloImplEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SueloImplEntityRepository extends JpaRepository<SueloImplEntity, Integer> {


    @Override
    Optional<SueloImplEntity> findById(Integer integer);

}
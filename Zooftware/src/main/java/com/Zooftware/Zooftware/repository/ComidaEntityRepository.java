package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ComidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ComidaEntityRepository extends JpaRepository<ComidaEntity, Integer> {


    @Override
    Optional<ComidaEntity> findById(Integer integer);

    List<ComidaEntity> findByNombre(String nombre);





}
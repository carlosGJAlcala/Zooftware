package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.instalaciones.AlmacenComidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlmacenComidaEntityRepository extends JpaRepository<AlmacenComidaEntity, Integer> {


    @Override
    Optional<AlmacenComidaEntity> findById(Integer integer);

    List<AlmacenComidaEntity> findAll();
}
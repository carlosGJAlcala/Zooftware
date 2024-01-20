package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AlmacenComidaEntityRepository extends JpaRepository<AlmacenComidaEntity, Integer> {


    @Override
    Optional<AlmacenComidaEntity> findById(Integer integer);

    List<AlmacenComidaEntity> findAll();
}
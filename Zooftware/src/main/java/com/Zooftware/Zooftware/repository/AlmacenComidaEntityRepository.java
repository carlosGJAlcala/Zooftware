package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlmacenComidaEntityRepository extends JpaRepository<AlmacenComidaEntity, Integer> {


    @Override
    Optional<AlmacenComidaEntity> findById(Integer integer);
}
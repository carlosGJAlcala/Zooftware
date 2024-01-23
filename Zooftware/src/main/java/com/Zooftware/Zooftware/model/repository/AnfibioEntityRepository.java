package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.instalaciones.AnfibioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnfibioEntityRepository extends JpaRepository<AnfibioEntity, Integer> {

    @Override
    Optional<AnfibioEntity> findById(Integer integer);



}
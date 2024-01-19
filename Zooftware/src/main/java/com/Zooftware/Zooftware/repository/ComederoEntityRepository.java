package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComederoEntityRepository extends JpaRepository<ComederoEntity, Integer> {


    @Override
    Optional<ComederoEntity> findById(Integer integer);


}
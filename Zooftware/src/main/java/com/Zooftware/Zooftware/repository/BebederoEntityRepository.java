package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BebederoEntityRepository extends JpaRepository<BebederoEntity, Integer> {


    @Override
    Optional<BebederoEntity> findById(Integer integer);


}
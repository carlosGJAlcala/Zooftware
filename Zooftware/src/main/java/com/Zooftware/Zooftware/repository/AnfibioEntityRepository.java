package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.AnfibioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnfibioEntityRepository extends JpaRepository<AnfibioEntity, Integer> {

    @Override
    Optional<AnfibioEntity> findById(Integer integer);



}
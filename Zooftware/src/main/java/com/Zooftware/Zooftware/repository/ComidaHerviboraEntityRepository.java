package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ComidaHerviboraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComidaHerviboraEntityRepository extends JpaRepository<ComidaHerviboraEntity, Integer> {


    @Override
    Optional<ComidaHerviboraEntity> findById(Integer integer);
}
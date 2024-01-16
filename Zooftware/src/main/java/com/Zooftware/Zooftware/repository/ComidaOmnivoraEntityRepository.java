package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ComidaOmnivoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ComidaOmnivoraEntityRepository extends JpaRepository<ComidaOmnivoraEntity, Integer> {

    @Override
    Optional<ComidaOmnivoraEntity> findById(Integer integer);


}
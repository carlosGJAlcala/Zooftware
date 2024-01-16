package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ComidaCarnivoraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ComidaCarnivoraEntityRepository extends JpaRepository<ComidaCarnivoraEntity, Integer> {


    @Override
    Optional<ComidaCarnivoraEntity> findById(Integer integer);

    List<ComidaCarnivoraEntity> findByEstado(Object estado);


}
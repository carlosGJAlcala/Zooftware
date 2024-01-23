package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.persona.TrabajadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrabajadorEntityRepository extends JpaRepository<TrabajadorEntity, Integer> {

    @Override
    Optional<TrabajadorEntity> findById(Integer integer);

    List<TrabajadorEntity> findByActivoTrue();

    List<TrabajadorEntity> findByJefe_Id(int id);


}
package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.TrabajadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrabajadorEntityRepository extends JpaRepository<TrabajadorEntity, Integer> {

    @Override
    Optional<TrabajadorEntity> findById(Integer integer);

    List<TrabajadorEntity> findByActivo(boolean activo);

}
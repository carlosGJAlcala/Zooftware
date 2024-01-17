package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TareaEntityRepository extends JpaRepository<TareaEntity, Integer> {


    @Override
    Optional<TareaEntity> findById(Integer integer);

    List<TareaEntity> findByTipoTarea(String tipoTarea);




}
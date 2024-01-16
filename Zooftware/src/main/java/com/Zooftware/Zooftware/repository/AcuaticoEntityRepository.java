package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AcuaticoEntityRepository extends JpaRepository<AcuaticoEntity, Integer> {
    List<AcuaticoEntity> findByTipoAgua(TipoAgua tipoAgua);




    @Override
    Optional<AcuaticoEntity> findById(Integer integer);
}
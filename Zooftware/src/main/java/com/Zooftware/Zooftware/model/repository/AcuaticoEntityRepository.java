package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.instalaciones.AcuaticoEntity;
import com.Zooftware.Zooftware.model.entities.enums.TipoAgua;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AcuaticoEntityRepository extends JpaRepository<AcuaticoEntity, Integer> {
    List<AcuaticoEntity> findByTipoAgua(TipoAgua tipoAgua);




    @Override
    Optional<AcuaticoEntity> findById(Integer integer);
}
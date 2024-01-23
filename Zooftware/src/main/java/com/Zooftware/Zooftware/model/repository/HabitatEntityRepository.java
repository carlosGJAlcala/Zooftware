package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.instalaciones.HabitatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HabitatEntityRepository extends JpaRepository<HabitatEntity, Integer> {

    @Override
    Optional<HabitatEntity> findById(Integer integer);

    List<HabitatEntity> findByTipoHabitat(String tipoHabitat);

    List<HabitatEntity> findAll();

}
package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.instalaciones.BebederoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BebederoEntityRepository extends JpaRepository<BebederoEntity, Integer> {


    @Override
    Optional<BebederoEntity> findById(Integer integer);

    @Query(value = "SELECT * FROM bebedero WHERE bebedero.habitat_id=:habitat_id",nativeQuery = true)
    List<BebederoEntity> findByHabitat_Id(int habitat_id);


}
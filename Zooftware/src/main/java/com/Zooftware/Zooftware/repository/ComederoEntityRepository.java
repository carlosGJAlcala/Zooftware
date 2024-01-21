package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ComederoEntityRepository extends JpaRepository<ComederoEntity, Integer> {


    @Override
    Optional<ComederoEntity> findById(Integer integer);

    @Query("select c from ComederoEntity c where c.habitat.id = ?1")
    List<ComederoEntity> findByHabitat_Id(int id);


}
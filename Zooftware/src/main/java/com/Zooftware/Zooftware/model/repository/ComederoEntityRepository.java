package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.comida.ComidaEntity;
import com.Zooftware.Zooftware.model.entities.instalaciones.ComederoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ComederoEntityRepository extends JpaRepository<ComederoEntity, Integer> {


    @Override
    Optional<ComederoEntity> findById(Integer integer);

    @Query("select c from ComederoEntity c where c.habitat.id = ?1")
    List<ComederoEntity> findByHabitat_Id(int id);

    @Transactional
    @Modifying
    @Query("update ComederoEntity c set c.comidaEntity = ?1 where c.id = ?2")
    void updateComidaEntityById(ComidaEntity comidaEntity, int id);

    @Transactional
    @Modifying
    @Query("update ComederoEntity c set c.id = ?1")
    int updateIdBy(int id);
}
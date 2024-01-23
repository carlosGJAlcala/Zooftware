package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;
import com.Zooftware.Zooftware.model.entities.organimos.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AnimalEntityRepository extends JpaRepository<AnimalEntity, Integer> {

    @Override
    Optional<AnimalEntity> findById(Integer integer);
    @Query(value = "SELECT * FROM animal",nativeQuery = true)
    List<AnimalEntity> findAll();

    List<AnimalEntity> findByNombre(String nombre);

    List<AnimalEntity> findByEstadoAnimal(EstadoAnimal estadoAnimal);

    List<AnimalEntity> findByTipo(String tipo);

    @Query("select a from AnimalEntity a where a.habitat.id = ?1")
    List<AnimalEntity> findByHabitat_Id(Integer id);

    void deleteById(int id);

}
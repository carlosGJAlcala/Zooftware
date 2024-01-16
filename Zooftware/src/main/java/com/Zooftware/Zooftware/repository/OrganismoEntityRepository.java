package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.OrganismoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrganismoEntityRepository extends JpaRepository<OrganismoEntity, Integer> {


    @Override
    Optional<OrganismoEntity> findById(Integer integer);

    OrganismoEntity findByPlantaId(Integer plantaId);

    OrganismoEntity findByAnimalId(Integer animalId);


    List<OrganismoEntity> findByNombreEspecie(String nombreEspecie);
}

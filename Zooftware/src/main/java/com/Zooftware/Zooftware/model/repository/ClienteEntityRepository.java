package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.persona.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteEntityRepository extends JpaRepository<ClienteEntity, Integer> {


    @Override
    Optional<ClienteEntity> findById(Integer integer);

    List<ClienteEntity> findByNumVisitas(int numVisitas);

    ClienteEntity findByUsername(String username);


}
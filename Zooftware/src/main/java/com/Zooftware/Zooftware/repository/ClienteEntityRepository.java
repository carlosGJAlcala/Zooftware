package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteEntityRepository extends JpaRepository<ClienteEntity, Integer> {


    @Override
    Optional<ClienteEntity> findById(Integer integer);

    List<ClienteEntity> findByNumVisitas(int numVisitas);


}
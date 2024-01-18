package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ContactoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactoEntityRepository extends JpaRepository<ContactoEntity, Integer> {

    @Override
    Optional<ContactoEntity> findById(Integer integer);

    Optional<ContactoEntity> findByCorreo(String correo);



}
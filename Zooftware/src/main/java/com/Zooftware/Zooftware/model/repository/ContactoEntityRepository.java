package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.persona.ContactoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContactoEntityRepository extends JpaRepository<ContactoEntity, Integer> {


    Optional<ContactoEntity> findById(int integer);

    Optional<ContactoEntity> findByCorreo(String correo);

    ContactoEntity findByNumeroTlf(Integer numeroTlf);


}
package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.mensajeria.MensajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MensajeEntityRepository extends JpaRepository<MensajeEntity, Integer> {


    @Override
    Optional<MensajeEntity> findById(Integer integer);

    List<MensajeEntity> findByDestinario(String destinario);

    List<MensajeEntity> findByRemitente(String remitente);


    List<MensajeEntity> findByAsunto(String asunto);



}
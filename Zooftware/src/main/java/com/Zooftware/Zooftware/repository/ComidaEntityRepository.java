package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.ComidaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ComidaEntityRepository extends JpaRepository<ComidaEntity, Integer> {


    @Override
    Optional<ComidaEntity> findById(Integer integer);

    Optional<ComidaEntity> findByNombre(String nombre);

    List<ComidaEntity> findByTipoComida(String tipoComida);


}
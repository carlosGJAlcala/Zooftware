package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.comida.ComidaEntity;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface ComidaEntityRepository extends JpaRepository<ComidaEntity, Integer> {


    @Override
    Optional<ComidaEntity> findById(Integer integer);

    Optional<ComidaEntity> findByNombre(String nombre);

    List<ComidaEntity> findByTipoComida(TipoComida tipoComida);

    Optional<ComidaEntity> findByComederoEntity_Id(int id);


}
package com.Zooftware.Zooftware.model.repository;

import com.Zooftware.Zooftware.model.entities.enums.TipoPersona;
import com.Zooftware.Zooftware.model.entities.persona.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface PersonaEntityRepository extends JpaRepository<PersonaEntity, Integer> {


    @Override
    Optional<PersonaEntity> findById(Integer integer);

    Optional<PersonaEntity> findPersonaByUsername(String username);

    Optional<TipoPersona> findTipoPersonaByUsername(String username);

    String findPasswordById(Integer integer);


    boolean existsByUsernameLikeIgnoreCaseAndPasswordLike(@NonNull String username, @NonNull String password);


}
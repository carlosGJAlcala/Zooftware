package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.modelJPA.enums.TipoEmpleado;
import com.Zooftware.Zooftware.modelJPA.persona.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface PersonaEntityRepository extends JpaRepository<PersonaEntity, Integer> {


    @Override
    Optional<PersonaEntity> findById(Integer integer);

    Optional<PersonaEntity> findPersonaByUsername(String username);

    Optional<TipoEmpleado> findTipoEmpleadoByUsername(String username);

    String findPasswordById(Integer integer);


    boolean existsByUsernameLikeIgnoreCaseAndPasswordLike(@NonNull String username, @NonNull String password);


}
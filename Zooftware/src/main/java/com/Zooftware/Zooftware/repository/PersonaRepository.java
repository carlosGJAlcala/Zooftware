package com.Zooftware.Zooftware.repository;

import com.Zooftware.Zooftware.model.persona.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {


    Optional<Persona> findPersonaByUsername(String username);

}

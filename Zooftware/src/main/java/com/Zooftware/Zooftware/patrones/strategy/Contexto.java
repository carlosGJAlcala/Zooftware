package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Contexto {
    private Estrategia estrategia; // Estrategia que se usa.
    private HabitatEntityDto habitat;// habita que usa.

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public HabitatEntityDto getHabitat() {
        return habitat;
    }

    public void setHabitat(HabitatEntityDto habitat) {
        this.habitat = habitat;
    }




    public Contexto() {

    }

    /**
     * Establece la estrategia a usar.
     *
     * @param e Estrategia a usar.
     */
    public void setEstrategia(Estrategia e) {
        this.estrategia = e;
    }

    /**
     * Ejecuta la estrategia.
     */
    public void ejecutaEstrategia() {
        estrategia.ejecutar(habitat);

    }
}

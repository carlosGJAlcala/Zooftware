package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;

public class Contexto {
    private Estrategia estrategia; // Estrategia que se usa.
    private HabitatEntityDto habita;// habita que usa.

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public HabitatEntityDto getHabita() {
        return habita;
    }

    public void setHabita(HabitatEntityDto habita) {
        this.habita = habita;
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
        estrategia.ejecutar(habita);

    }
}

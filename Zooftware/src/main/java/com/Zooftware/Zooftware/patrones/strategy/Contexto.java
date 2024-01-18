package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;

public class Contexto {
    private Estrategia estrategia; // Estrategia que se usa.
    private HabitatEntityDto habita;// habita que usa.

    /**
     * Constructor.
     *
     * @param e Estrategia que se usa.
     * @param u Lista de alumnos.
     */
    public Contexto(Estrategia e,HabitatEntityDto u) {
        this.estrategia = e;
        this.habita = u;
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

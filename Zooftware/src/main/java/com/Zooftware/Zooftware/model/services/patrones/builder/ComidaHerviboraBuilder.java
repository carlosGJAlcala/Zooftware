package com.Zooftware.Zooftware.model.services.patrones.builder;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoComida;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;

public class ComidaHerviboraBuilder implements IComidaBuilder {
    ComidaEntityDto comida;


    @Override
    public void abrirbolsa() {

        comida = new ComidaEntityDto();
        comida.setNombre("Coles de Bruselas con guisantes");
        comida.setEstadoComida(EstadoComida.CRUDA);
        comida.setTipoComida(TipoComida.HERVIBORA);

    }

    @Override
    public void calentarComida() {
        comida.setEstadoComida(EstadoComida.HACIENDOSE);
    }

    @Override
    public void mezclarTopics() {
        comida.setIngredientePrincipal("Coles de Bruselas");
        comida.setIngredienteSecundario("guisantes");

    }

    @Override
    public ComidaEntityDto getAlimento() {
        return comida;
    }

    @Override
    public void ponerComidaEnCubo() {
        comida.setEstadoComida(EstadoComida.HECHA);

    }
}

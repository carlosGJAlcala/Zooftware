package com.Zooftware.Zooftware.model.services.patrones.builder;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoComida;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;

public class ComidaOmnivoraBuilder implements IComidaBuilder {
    ComidaEntityDto comida;


    @Override
    public void abrirbolsa() {

        comida = new ComidaEntityDto();
        comida.setNombre("SalteadoDeVerduraConPavo");
        comida.setEstadoComida(EstadoComida.CRUDA);
        comida.setTipoComida(TipoComida.OMNIVORA);

    }

    @Override
    public void calentarComida() {
        comida.setEstadoComida(EstadoComida.HACIENDOSE);
    }

    @Override
    public void mezclarTopics() {
        comida.setIngredientePrincipal("Lechuga y tomates");
        comida.setIngredienteSecundario("Pavo");

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

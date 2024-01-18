package com.Zooftware.Zooftware.patrones.builder;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;

import java.util.List;

public class ComidaOmnivoraBuilder implements IComidaBuilder{
    ComidaEntityDto comida;


    @Override
    public boolean abrirbolsa(List<ComidaEntityDto> provisiones) {
        if (!provisiones.isEmpty()){
            comida=provisiones.get(0);
            comida.setNombre("SalteadoDeVerduraConPavo");
            comida.setEstadoComida(EstadoComida.CRUDA);
            comida.setTipoComida(TipoComida.OMNIVORA);
            return true;
        }else {
            return  false;
        }

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

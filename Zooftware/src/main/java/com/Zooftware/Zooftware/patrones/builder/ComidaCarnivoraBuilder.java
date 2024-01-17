package com.Zooftware.Zooftware.patrones.builder;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;

import java.util.List;

public class ComidaCarnivoraBuilder implements IComidaBuilder{
    ComidaEntityDto comida;


    @Override
    public boolean abrirbolsa(List<ComidaEntityDto> provisiones) {
        if (!provisiones.isEmpty()){
            comida=provisiones.getFirst();
            comida.setNombre(" ternera con pavo");
            comida.setEstadoComida(EstadoComida.CRUDA);
            comida.setTipoComida(TipoComida.CARNIVORA);
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
        comida.setIngredientePrincipal("ternera");
        comida.setIngredienteSecundario(" pavo");

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


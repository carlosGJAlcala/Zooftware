package com.Zooftware.Zooftware.model.services.patrones.builder;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoComida;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;
import org.springframework.stereotype.Service;

@Service
public class ComidaCarnivoraBuilder implements IComidaBuilder {
    ComidaEntityDto comida;


    @Override
    public void abrirbolsa() {
        comida = new ComidaEntityDto();
        comida.setNombre(" ternera con pavo");
        comida.setEstadoComida(EstadoComida.CRUDA);
        comida.setTipoComida(TipoComida.CARNIVORA);


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


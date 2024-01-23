package com.Zooftware.Zooftware.model.services.patrones.strategy;

import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.services.patrones.builder.Cocinero;
import com.Zooftware.Zooftware.model.services.patrones.builder.ComidaCarnivoraBuilder;
import com.Zooftware.Zooftware.model.services.patrones.builder.ComidaHerviboraBuilder;
import com.Zooftware.Zooftware.model.services.patrones.builder.ComidaOmnivoraBuilder;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;

import java.util.List;

public class Alimentar implements Estrategia {


    @Override
    public Object ejecutar(Object args) {


        List<ComederoEntityDto> comederos = (List<ComederoEntityDto>) args;

        Cocinero cocinero = new Cocinero();
        ComidaEntityDto comida;

        for (ComederoEntityDto comedero : comederos) {
            TipoComida tipo = comedero.getTipo();
            switch (tipo) {
                case CARNIVORA:
                    cocinero.setComidadbuilder(new ComidaCarnivoraBuilder());
                    cocinero.crearComida();
                    comida = cocinero.getComida();
                    comedero.setComida(comida);
                    break;
                case HERVIBORA:
                    cocinero.setComidadbuilder(new ComidaHerviboraBuilder());
                    cocinero.crearComida();
                    comida = cocinero.getComida();
                    comedero.setComida(comida);
                    break;
                case OMNIVORA:
                    cocinero.setComidadbuilder(new ComidaOmnivoraBuilder());
                    cocinero.crearComida();
                    comida = cocinero.getComida();
                    comedero.setComida(comida);
                    break;
                default:
                    break;
            }


        }


        return comederos;

    }
}

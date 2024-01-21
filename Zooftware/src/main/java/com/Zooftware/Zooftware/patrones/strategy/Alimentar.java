package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDAO.HabitatDAOImp;
import com.Zooftware.Zooftware.modelDAO.IComidaDAO;
import com.Zooftware.Zooftware.modelDAO.IHabitatDAO;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;
import com.Zooftware.Zooftware.patrones.builder.Cocinero;
import com.Zooftware.Zooftware.patrones.builder.ComidaCarnivoraBuilder;
import com.Zooftware.Zooftware.patrones.builder.ComidaHerviboraBuilder;
import com.Zooftware.Zooftware.patrones.builder.ComidaOmnivoraBuilder;
import com.Zooftware.Zooftware.service.persona.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

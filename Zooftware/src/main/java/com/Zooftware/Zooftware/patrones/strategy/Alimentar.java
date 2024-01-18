package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;
import com.Zooftware.Zooftware.patrones.builder.Cocinero;
import com.Zooftware.Zooftware.patrones.builder.ComidaCarnivoraBuilder;

import java.util.List;

public class Alimentar implements Estrategia{


    AlmacenSingleton almacen;
    @Override
    public void ejecutar(HabitatEntityDto habita) {

        List<ComederoEntityDto> comederos= habita.getComederos();
        almacen= AlmacenSingleton.getInstancia();
        Cocinero cocinero=almacen.getCocinero();

        for(ComederoEntityDto comedero:comederos){
            TipoComida tipo =comedero.getTipo();
            switch (tipo){
                case CARNIVORA :
                    cocinero.setComidadbuilder(new ComidaCarnivoraBuilder());
                    break;
                case HERVIBORA:
                    cocinero.setComidadbuilder(new ComidaCarnivoraBuilder());
                    break;
                case OMNIVORA:
                    cocinero.setComidadbuilder(new ComidaCarnivoraBuilder());
                    break;
                default:break;
            }

            cocinero.crearComida();
           comedero.setComida( cocinero.getComida());

        }




    }
}

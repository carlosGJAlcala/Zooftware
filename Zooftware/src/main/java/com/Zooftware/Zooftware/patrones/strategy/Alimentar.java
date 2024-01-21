package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDAO.HabitatDAOImp;
import com.Zooftware.Zooftware.modelDAO.IComidaDAO;
import com.Zooftware.Zooftware.modelDAO.IHabitatDAO;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;
import com.Zooftware.Zooftware.patrones.builder.Cocinero;
import com.Zooftware.Zooftware.patrones.builder.ComidaCarnivoraBuilder;
import com.Zooftware.Zooftware.service.persona.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Alimentar implements Estrategia{

    @Autowired
    AlmacenSingleton almacen;

    @Autowired
    IComidaDAO iComidaDAO;

    @Autowired
    IHabitatDAO iHabitatDAO;

    @Override
    public Object ejecutar(HabitatEntityDto habita) {

        //Recibo el habitat al que quiero rellenar sus comederos

        //obtener lista de comederos que tienen el habitat id

        //Crear una instancia de cocinero


        List<ComederoEntityDto> comederos= habita.getComederos();
        //almacen= AlmacenSingleton.getInstancia();
        //Cocinero concinero = almacen.CrearCocinero();
        Cocinero cocinero= new Cocinero();
        //almacen.cargarListAlmacen();

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

            //Crear comida
            //Guardar esta comida en los comederos indicados


            cocinero.crearComida();
            //iComidaDAO.guardarComida(cocinero.getComida());


            comedero.setComida( cocinero.getComida());

        }


    return  comederos;

    }
}

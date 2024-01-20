package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDAO.HabitatDAOImp;
import com.Zooftware.Zooftware.modelDAO.IHabitatDAO;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
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
    IHabitatDAO iHabitatDAO;

    @Override
    public void ejecutar(HabitatEntityDto habita) {

        iHabitatDAO.buscarPorId(1);

        List<ComederoEntityDto> comederos= habita.getComederos();
        //almacen= AlmacenSingleton.getInstancia();
        Cocinero cocinero=almacen.crearCocinero();
        almacen.cargarListAlmacen();

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

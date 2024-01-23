package com.Zooftware.Zooftware.model.services.patrones.strategy;

import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;

import java.util.List;

public class RellenarBebederos implements Estrategia {


    @Override
    public Object ejecutar(Object args) {
        List<BebederoEntityDto> bebederos = (List<BebederoEntityDto>) args;

        for (BebederoEntityDto bebedero : bebederos) {

            bebedero.setCantidad(100);
        }
        return bebederos;
    }
}

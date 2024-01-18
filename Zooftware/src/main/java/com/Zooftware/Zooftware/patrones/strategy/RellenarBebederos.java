package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;

import java.util.List;

public class RellenarBebederos implements Estrategia {


    @Override
    public void ejecutar(HabitatEntityDto habita) {

        List<BebederoEntityDto> bebederos= habita.getBebederos();

        for(BebederoEntityDto bebedero:bebederos){

            bebedero.setCantidad(100);
        }

    }
}

package com.Zooftware.Zooftware.patrones.strategy;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;

import java.util.List;

public class RellenarBebederos implements Estrategia {




    @Override
    public Object ejecutar(Object args) {
        List<BebederoEntityDto> bebederos=(List<BebederoEntityDto> ) args;

        for(BebederoEntityDto bebedero:bebederos){

            bebedero.setCantidad(100);
        }
        return bebederos;    }
}

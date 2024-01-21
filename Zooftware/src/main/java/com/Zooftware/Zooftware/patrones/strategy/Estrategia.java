package com.Zooftware.Zooftware.patrones.strategy;


import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;

public interface Estrategia {

    Object ejecutar(HabitatEntityDto habita);
}

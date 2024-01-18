package com.Zooftware.Zooftware.patrones.Singleton;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.patrones.builder.Cocinero;

import java.util.List;

public class AlmacenSingleton extends AlmacenComidaEntityDto  {

    private Cocinero cocinero;
    private static AlmacenSingleton instancia;

    private AlmacenSingleton() {
        cocinero=new Cocinero();
    }

    public static AlmacenSingleton getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new AlmacenSingleton();
        }
        return instancia;
    }


    public Cocinero getCocinero() {
        return cocinero;
    }
}

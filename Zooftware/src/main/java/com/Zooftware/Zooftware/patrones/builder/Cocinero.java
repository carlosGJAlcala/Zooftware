package com.Zooftware.Zooftware.patrones.builder;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Cocinero {


    AlmacenComidaEntityDto almacenComidaEntityDto;
    private IComidaBuilder comidadbuilder;

    public ComidaEntityDto getComida() {
        return comidadbuilder.getAlimento();
    }

    public Cocinero() {

    }

    /**
     * Construye el producto Pizza paso a paso.
     */
    public void crearComida() {
        //Obtener la comida del almacen get0

      //  comidadbuilder.abrirbolsa();
        comidadbuilder.mezclarTopics();
        comidadbuilder.calentarComida();
        comidadbuilder.ponerComidaEnCubo();


    }

    public void setComidadbuilder(IComidaBuilder comidadbuilder) {
        this.comidadbuilder = comidadbuilder;
    }

}

package com.Zooftware.Zooftware.patrones.builder;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import org.springframework.stereotype.Component;

@Component
public class Cocinero {


    AlmacenComidaEntityDto almacenComidaEntityDto;
    private IComidaBuilder comidadbuilder;
    public ComidaEntityDto getComida() {
        return comidadbuilder.getAlimento();
    }
    public Cocinero(){

    }

    /**
     * Construye el producto Pizza paso a paso.
     */
    public void crearComida() {
        if(comidadbuilder.abrirbolsa(almacenComidaEntityDto.getProvisiones())){
            comidadbuilder.mezclarTopics();
            comidadbuilder.calentarComida();
            comidadbuilder.ponerComidaEnCubo();
        }else {
            System.out.println("No quedan provisiones");

        }

    }
    public void setComidadbuilder(IComidaBuilder comidadbuilder) {
        this.comidadbuilder = comidadbuilder;
    }

}

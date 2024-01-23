package com.Zooftware.Zooftware.model.services.patrones.builder;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;

public interface IComidaBuilder {


    void abrirbolsa();

    void calentarComida();

    void mezclarTopics();

    ComidaEntityDto getAlimento();

    void ponerComidaEnCubo();


}

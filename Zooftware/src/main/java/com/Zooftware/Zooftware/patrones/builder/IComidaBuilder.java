package com.Zooftware.Zooftware.patrones.builder;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;

import java.util.List;

public interface IComidaBuilder {


    void abrirbolsa();

    void calentarComida();

    void mezclarTopics();

    ComidaEntityDto getAlimento();

    void ponerComidaEnCubo();


}

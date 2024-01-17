package com.Zooftware.Zooftware.patrones.builder;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;

import java.util.List;

public interface IComidaBuilder {




    boolean abrirbolsa(List<ComidaEntityDto> provisiones);
    void calentarComida();

    void mezclarTopics();
    ComidaEntityDto getAlimento();
    void ponerComidaEnCubo();


}

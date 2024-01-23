package com.Zooftware.Zooftware.model.services.patrones.factoryMethod;

import com.Zooftware.Zooftware.model.entities.enums.TipoPersona;

public interface FactoryMethodProxy {
    Object devolverProxy(TipoPersona tipo);

}

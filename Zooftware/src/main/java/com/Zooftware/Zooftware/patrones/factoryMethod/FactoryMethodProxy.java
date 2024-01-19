package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.patrones.facade.Zooftware;

public interface FactoryMethodProxy {
    Zooftware devolverProxy(TipoPersona tipo);
}

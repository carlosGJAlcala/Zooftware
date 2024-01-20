package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.patrones.facade.Zooftware;
import com.Zooftware.Zooftware.patrones.proxy.IAccionesJefe;

public interface FactoryMethodProxy {
    IAccionesJefe devolverProxy(TipoPersona tipo);
}

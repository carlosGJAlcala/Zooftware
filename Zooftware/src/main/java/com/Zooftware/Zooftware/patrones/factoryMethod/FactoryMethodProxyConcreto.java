package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.patrones.facade.Zooftware;
import com.Zooftware.Zooftware.patrones.proxy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Proxy;

@Service
public class FactoryMethodProxyConcreto implements FactoryMethodProxy {

    private final Zooftware zooftware;

    @Autowired
    public FactoryMethodProxyConcreto(Zooftware zooftware) {
        this.zooftware = zooftware;
    }


    @Override
    public Object devolverProxy(TipoPersona tipo) {
        switch (tipo) {
            case EMPLEADO:
                return Proxy.newProxyInstance(
                        IAccionesEmpleado.class.getClassLoader(),
                        new Class<?>[]{IAccionesEmpleado.class},
                        new ProxyEmpleado(zooftware)
                );
            case CLIENTE:
                return Proxy.newProxyInstance(
                        IAccionesCliente.class.getClassLoader(),
                        new Class<?>[]{IAccionesCliente.class},
                        new ProxyCliente(zooftware)
                );
            case JEFE:
                return Proxy.newProxyInstance(
                        IAccionesJefe.class.getClassLoader(),
                        new Class<?>[]{IAccionesJefe.class},
                        new ProxyJefe(zooftware)
                );
            default:
                throw new IllegalArgumentException("Tipo de persona no soportado");
        }
    }

}

package com.Zooftware.Zooftware.patrones.factoryMethod;

import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import com.Zooftware.Zooftware.patrones.facade.Zooftware;
import com.Zooftware.Zooftware.patrones.proxy.*;

import java.lang.reflect.Proxy;

public class FactoryMethodProxyConcreto  implements FactoryMethodProxy{
    @Override
    public Zooftware devolverProxy(TipoPersona tipo) {

        switch (tipo){
            case EMPLEADO :
                return (Zooftware) Proxy.newProxyInstance(IAccionesEmpleado.class.getClassLoader(),Zooftware.class.getInterfaces(),new ProxyEmpleado(new Zooftware()));
            case CLIENTE:
                return (Zooftware) Proxy.newProxyInstance(IAccionesCliente.class.getClassLoader(),Zooftware.class.getInterfaces(),new ProxyCliente(new Zooftware()));
            case JEFE:
                return (Zooftware) Proxy.newProxyInstance(IAccionesJefe.class.getClassLoader(),Zooftware.class.getInterfaces(),new ProxyJefe(new Zooftware()));
            default:break;

        }
        return null;
    }
}

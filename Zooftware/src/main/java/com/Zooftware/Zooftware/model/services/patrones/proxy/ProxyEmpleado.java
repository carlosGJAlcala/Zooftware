package com.Zooftware.Zooftware.model.services.patrones.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public class ProxyEmpleado implements InvocationHandler {

	private final IAccionesEmpleado acciones;

	public ProxyEmpleado(IAccionesEmpleado acciones) {
		this.acciones = acciones;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before execute method = " + method.getName());
		Object res = method.invoke(acciones, args);
		System.out.println("After execute method ....");
		return res;	}
}//end ProxyEmpleado
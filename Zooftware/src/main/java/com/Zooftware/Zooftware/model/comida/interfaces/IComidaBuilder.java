package com.Zooftware.Zooftware.model.comida.interfaces;


/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:10
 */
public interface IComidaBuilder {

	public void abrirBolsa();

	public void calentarComida();

	public IAlimentacion getAlimento();

	public void ponerComidaEnUnCubo();

}
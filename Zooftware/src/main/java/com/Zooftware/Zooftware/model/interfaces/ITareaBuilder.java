package com.Zooftware.Zooftware.model.interfaces;


import com.Zooftware.Zooftware.model.interfaces.IEstadoMensaje;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:09
 */
public interface ITareaBuilder {

	public IEstadoMensaje m_IEstadoMensaje;

	public void enCurso();

	public void hecho();

	public void Incidencia();

	public void Pendiente();

}
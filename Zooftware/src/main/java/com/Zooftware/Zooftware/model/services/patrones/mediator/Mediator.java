package com.Zooftware.Zooftware.model.services.patrones.mediator;

import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;
import com.Zooftware.Zooftware.model.dto.persona.TrabajadorEntityDto;

public interface Mediator {

    /**
     * Añade un colega a la lista de colegas.
     *
     * @param colega Colega a añadir.
     */
    public void setColega(TrabajadorEntityDto colega);

    /**
     * Devuelve el colega de la lista de la posición pasada como argumento.
     *
     * @param correo Índice o posición del colega.
     * @return
     */
    public TrabajadorEntityDto getColega(String correo);

    /**
     * Envía un mensaje al colega cuyo identificador se pasa como argumento.
     *
     * @param mensaje Mensaje a enviar.
     * @param correo del colega al que se le envía el mensaje.
     */
    public void enviar(MensajeEntityDto mensaje, String correo);
}
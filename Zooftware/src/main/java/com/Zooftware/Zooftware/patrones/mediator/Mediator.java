package com.Zooftware.Zooftware.patrones.mediator;

import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;

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
     * @param indice Índice o posición del colega.
     * @return
     */
    public TrabajadorEntityDto getColega(int indice);

    /**
     * Envía un mensaje al colega cuyo identificador se pasa como argumento.
     *
     * @param mensaje Mensaje a enviar.
     * @param id Identificador del colega al que se le envía el mensaje.
     */
    public void enviar(MensajeEntityDto mensaje, int id);
}
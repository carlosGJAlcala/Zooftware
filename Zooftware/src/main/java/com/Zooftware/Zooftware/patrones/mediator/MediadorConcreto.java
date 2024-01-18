package com.Zooftware.Zooftware.patrones.mediator;

import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto implements Mediator {

    // Lista de colegas
    private List<TrabajadorEntityDto> colegas = new ArrayList<>();

    @Override
    public void setColega(TrabajadorEntityDto colega) {
        colegas.add(colega);
    }

    @Override
    public TrabajadorEntityDto getColega(int indice) {
        return colegas.get(indice);
    }

    /**
     * Envía un mensaje al colega cuyo identificador se pasa como argumento. Si
     * el identificador es -1, el mensaje se envía a todos los colegas. En otro
     * caso, solo se envía al colega concreto.
     *
     * @param mensaje Mensaje a enviar.
     * @param id Identificador del colega al que se le envía el mensaje.
     */
    @Override
    public void enviar(MensajeEntityDto mensaje, int id) {
        if (id == -1) {
            for (int i = 0; i < colegas.size(); i++) {
                getColega(i).recibir(mensaje);
            }
        } else {
            getColega(id).recibir(mensaje);
        }
    }
}

package com.Zooftware.Zooftware.patrones.mediator;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediadorConcreto implements Mediator {


    private static Map<String ,TrabajadorEntityDto> colegas = new HashMap<String,TrabajadorEntityDto>();

    @Override
    public void setColega(TrabajadorEntityDto colega) {
        colegas.put(colega.getContacto().getCorreo(),colega);
    }

    @Override
    public TrabajadorEntityDto getColega(String correo) {
        return colegas.get(correo);
    }


    @Override
    public void enviar(MensajeEntityDto mensaje, String correo) {
        if (correo == "all") {
            for (int i = 0; i < colegas.size(); i++) {
                getColega(correo).recibir(mensaje);
            }
        } else {
            getColega(correo).recibir(mensaje);
        }
    }
    void convertirArralisHasmap(ArrayList<TrabajadorEntityDto> trabajadores){
        for(TrabajadorEntityDto trabajador: trabajadores){
            this.setColega(trabajador);
        }
    }
}

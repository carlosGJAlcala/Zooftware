package com.Zooftware.Zooftware.controller;


import com.Zooftware.Zooftware.modelJPA.enums.TipoPersona;
import org.springframework.stereotype.Service;

/**
 * Sirver para pasar entre los controler el tipo de sesion para luego en el proxy devolver uno u otro
 *
 */
@Service
public class SesionTransferDTO {

    private TipoPersona datoCompartido;

    public TipoPersona getDatoCompartido() {
        return datoCompartido;
    }

    public void setDatoCompartido(TipoPersona datoCompartido) {
        this.datoCompartido = datoCompartido;
    }
}

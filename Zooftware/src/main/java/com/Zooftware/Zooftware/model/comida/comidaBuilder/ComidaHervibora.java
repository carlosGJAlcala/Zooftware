package com.Zooftware.Zooftware.model.comida.comidaBuilder;

import com.Zooftware.Zooftware.model.comida.enums.EstadoComida;

public class ComidaHervibora {

    private  int id;

    private EstadoComida estado;
    public ComidaHervibora(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoComida getEstado() {
        return estado;
    }

    public void setEstado(EstadoComida estado) {
        this.estado = estado;
    }
}

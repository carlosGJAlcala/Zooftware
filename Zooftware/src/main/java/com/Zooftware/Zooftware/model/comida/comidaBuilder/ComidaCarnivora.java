package com.Zooftware.Zooftware.model.comida.comidaBuilder;

import com.Zooftware.Zooftware.model.comida.enums.EstadoComida;

public class ComidaCarnivora {
    private  int id;

    private EstadoComida estado;
    public ComidaCarnivora(){
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

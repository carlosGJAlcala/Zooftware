package com.Zooftware.Zooftware.patrones.adapter;

public class BebederoJson {

    private int id;
    private int cantidad;

    private int Habita_id;

    public BebederoJson(int id, int cantidad, int habita_id) {
        this.id = id;
        this.cantidad = cantidad;
        Habita_id = habita_id;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getHabita_id() {
        return Habita_id;
    }
}

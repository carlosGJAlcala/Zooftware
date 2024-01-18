package com.Zooftware.Zooftware.modelJPA.comida;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import jakarta.persistence.*;

@Entity
@Table(name = "comida")
public class ComidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int cantidad;
    @Enumerated(EnumType.STRING)
    private TipoComida tipoComida;

    public ComidaEntity(int id, String nombre, int cantidad, TipoComida tipoComida) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }
}

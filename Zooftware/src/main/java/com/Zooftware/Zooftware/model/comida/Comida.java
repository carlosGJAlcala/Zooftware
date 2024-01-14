package com.Zooftware.Zooftware.model.comida;

import com.Zooftware.Zooftware.model.comida.enums.TipoComida;
import com.Zooftware.Zooftware.model.comida.interfaces.IAlimentacion;
import jakarta.persistence.*;

@Entity
@Table(name = "comida")
public class Comida implements IAlimentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nombre;
    private int cantidad;

    @Enumerated(EnumType.STRING)
    private TipoComida tipoComida;

    public Comida(){

    }
    public Comida(int id, String nombre, int cantidad, TipoComida tipoComida) {
        this.id = id;
        Nombre = nombre;
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
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
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
    public void getDescripcion(){

    }
}

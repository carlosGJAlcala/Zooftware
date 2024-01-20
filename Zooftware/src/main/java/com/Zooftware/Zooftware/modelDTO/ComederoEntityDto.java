package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link ComederoEntity}
 */
public class ComederoEntityDto implements Serializable {
    private int id;

  //  private HabitatEntityDto habitatEntityDto;

    private  Integer cantidad;

    private TipoComida tipo;

    private ComidaEntityDto comida;
    public TipoComida getTipo() {
        return tipo;
    }

    @Default
    public ComederoEntityDto(int id, Integer cantidad, TipoComida tipo, ComidaEntityDto comida) {
        this.id = id;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.comida = comida;
    }

    public ComederoEntityDto(Integer cantidad, TipoComida tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public ComidaEntityDto getComida() {
        return comida;
    }

    public void setComida(ComidaEntityDto comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "ComederoEntityDto{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", tipo=" + tipo +
                ", comida=" + comida +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

/*
    public HabitatEntityDto getHabitatEntityDto() {
        return habitatEntityDto;
    }

    public void setHabitatEntityDto(HabitatEntityDto habitatEntityDto) {
        this.habitatEntityDto = habitatEntityDto;
    }
*/

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }
}
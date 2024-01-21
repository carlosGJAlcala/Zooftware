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

    private HabitatEntityDto habitat;

    private  Integer cantidad;

    private TipoComida tipo;

    private ComidaEntityDto comida;


    public TipoComida getTipo() {
        return tipo;
    }

    public ComederoEntityDto(int id, HabitatEntityDto habitat, Integer cantidad, TipoComida tipo, ComidaEntityDto comida) {
        this.id = id;
        this.habitat = habitat;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.comida = comida;

    }



    public ComederoEntityDto(Integer cantidad, TipoComida tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }@Default

    public ComederoEntityDto(Integer cantidad, TipoComida tipo,HabitatEntityDto habitat) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.habitat=habitat;
    }

    public ComidaEntityDto getComida() {
        return this.comida;
    }

    public void setComida(ComidaEntityDto comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return "ComederoEntityDto{" +
                "id=" + id +
                ", habitatEntityDto=" + habitat +
                ", cantidad=" + cantidad +
                ", tipo=" + tipo +
                ", comida=" + comida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComederoEntityDto that = (ComederoEntityDto) o;
        return getId() == that.getId() && Objects.equals(getHabitat(), that.getHabitat()) && Objects.equals(getCantidad(), that.getCantidad()) && getTipo() == that.getTipo() && Objects.equals(getComida(), that.getComida());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getHabitat(), getCantidad(), getTipo(), getComida());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HabitatEntityDto getHabitat() {
        return this.habitat;
    }

    public void setHabitat(HabitatEntityDto habitat) {
        this.habitat = habitat;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }


}
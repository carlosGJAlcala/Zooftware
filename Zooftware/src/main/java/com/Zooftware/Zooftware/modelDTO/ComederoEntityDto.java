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

    private HabitatEntityDto habitatEntityDto;

    private  Integer cantidad;

    private TipoComida tipo;

    private ComidaEntityDto comida;
    public TipoComida getTipo() {
        return tipo;
    }

    public ComederoEntityDto(int id, HabitatEntityDto habitatEntityDto, Integer cantidad, TipoComida tipo, ComidaEntityDto comida) {
        this.id = id;
        this.habitatEntityDto = habitatEntityDto;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.comida = comida;
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
                ", habitatEntityDto=" + habitatEntityDto +
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
        return getId() == that.getId() && Objects.equals(getHabitatEntityDto(), that.getHabitatEntityDto()) && Objects.equals(getCantidad(), that.getCantidad()) && getTipo() == that.getTipo() && Objects.equals(getComida(), that.getComida());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getHabitatEntityDto(), getCantidad(), getTipo(), getComida());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HabitatEntityDto getHabitatEntityDto() {
        return habitatEntityDto;
    }

    public void setHabitatEntityDto(HabitatEntityDto habitatEntityDto) {
        this.habitatEntityDto = habitatEntityDto;
    }

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
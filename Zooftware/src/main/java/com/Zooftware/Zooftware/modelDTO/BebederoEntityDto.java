package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link BebederoEntity}
 */
public class BebederoEntityDto implements Serializable {
    private int id;
    private int cantidad;

    private HabitatEntityDto habitatEntityDto;

    public BebederoEntityDto(int id, int cantidad, HabitatEntityDto habitatEntityDto) {
        this.id = id;
        this.cantidad = cantidad;
        this.habitatEntityDto = habitatEntityDto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BebederoEntityDto that = (BebederoEntityDto) o;
        return getId() == that.getId() && getCantidad() == that.getCantidad() && Objects.equals(getHabitatEntity(), that.getHabitatEntity());
    }

    @Override
    public String toString() {
        return "BebederoEntityDto{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", habitatEntity=" + habitatEntityDto +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCantidad(), getHabitatEntity());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public HabitatEntityDto getHabitatEntity() {
        return habitatEntityDto;
    }

    public void setHabitatEntityDto(HabitatEntityDto habitatEntityDto) {
        this.habitatEntityDto = habitatEntityDto;
    }
}
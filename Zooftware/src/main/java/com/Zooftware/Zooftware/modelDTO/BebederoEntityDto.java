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

   private HabitatEntityDto habitatEntity;

    public BebederoEntityDto(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }
    @Default
    public BebederoEntityDto( int cantidad, HabitatEntityDto habitatEntity) {
        this.cantidad = cantidad;
        this.habitatEntity = habitatEntity;
    }

    public BebederoEntityDto(int cantidad) {
        this.cantidad = cantidad;
    }




    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public HabitatEntityDto getHabitat() {
        return this. habitatEntity;
    }

    public void setHabitat(HabitatEntityDto habitatEntity) {
        this.habitatEntity = habitatEntity;
    }
}
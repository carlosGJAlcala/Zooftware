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
   @Default
    public BebederoEntityDto(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }


    public BebederoEntityDto(int cantidad) {
        this.cantidad = cantidad;
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
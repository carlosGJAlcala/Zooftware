package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.organimos.PlantaEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link PlantaEntity}
 */
public class PlantaEntityDto implements Serializable {
    private int id;
    private String nombre;

    public PlantaEntityDto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantaEntityDto entity = (PlantaEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nombre, entity.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ")";
    }
}
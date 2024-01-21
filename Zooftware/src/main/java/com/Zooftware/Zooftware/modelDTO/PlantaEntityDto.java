package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.PlantaEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link PlantaEntity}
 */
public class PlantaEntityDto implements Serializable {
    private int id;
    private String nombre;
    private HabitatEntityDto habitat;

    @Default
    public PlantaEntityDto(int id, String nombre, HabitatEntityDto habitat) {
        this.id = id;
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public PlantaEntityDto(String nombre){
        this.nombre = nombre;
    }




    @Override
    public String toString() {
        return "PlantaEntityDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", habitatEntityDto=" + habitat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantaEntityDto that = (PlantaEntityDto) o;
        return getId() == that.getId() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getHabitatEntity(), that.getHabitatEntity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getHabitatEntity());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HabitatEntityDto getHabitatEntity() {
        return this.habitat;
    }

    public void setHabitatEntity(HabitatEntityDto habitat) {
        this.habitat = habitat;
    }
}
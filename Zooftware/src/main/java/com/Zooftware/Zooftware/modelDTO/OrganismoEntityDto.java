package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.OrganismoEntity}
 */
public class OrganismoEntityDto implements Serializable {
    private final int id;
    private final int edad;
    private final String nombreEspecie;
    private final Integer animalId;
    private final Integer dimensionAnimalId;
    private final Integer plantaId;
    private final Integer organismoId;

    public OrganismoEntityDto(int id, int edad, String nombreEspecie, Integer animalId, Integer dimensionAnimalId, Integer plantaId, Integer organismoId) {
        this.id = id;
        this.edad = edad;
        this.nombreEspecie = nombreEspecie;
        this.animalId = animalId;
        this.dimensionAnimalId = dimensionAnimalId;
        this.plantaId = plantaId;
        this.organismoId = organismoId;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public Integer getDimensionAnimalId() {
        return dimensionAnimalId;
    }

    public Integer getPlantaId() {
        return plantaId;
    }

    public Integer getOrganismoId() {
        return organismoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrganismoEntityDto entity = (OrganismoEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.edad, entity.edad) &&
                Objects.equals(this.nombreEspecie, entity.nombreEspecie) &&
                Objects.equals(this.animalId, entity.animalId) &&
                Objects.equals(this.dimensionAnimalId, entity.dimensionAnimalId) &&
                Objects.equals(this.plantaId, entity.plantaId) &&
                Objects.equals(this.organismoId, entity.organismoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, edad, nombreEspecie, animalId, dimensionAnimalId, plantaId, organismoId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "edad = " + edad + ", " +
                "nombreEspecie = " + nombreEspecie + ", " +
                "animalId = " + animalId + ", " +
                "dimensionAnimalId = " + dimensionAnimalId + ", " +
                "plantaId = " + plantaId + ", " +
                "organismoId = " + organismoId + ")";
    }
}
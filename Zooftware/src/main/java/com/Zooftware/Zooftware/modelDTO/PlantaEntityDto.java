package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.PlantaEntity}
 */
public class PlantaEntityDto implements Serializable {
    private final int id;
    private final Integer sueloId;

    public PlantaEntityDto(int id, Integer sueloId) {
        this.id = id;
        this.sueloId = sueloId;
    }

    public int getId() {
        return id;
    }

    public Integer getSueloId() {
        return sueloId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantaEntityDto entity = (PlantaEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sueloId, entity.sueloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sueloId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sueloId = " + sueloId + ")";
    }
}
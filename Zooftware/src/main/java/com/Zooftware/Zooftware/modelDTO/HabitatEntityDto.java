package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.HabitatEntity}
 */
public class HabitatEntityDto implements Serializable {
    private final int id;
    private final TipoHabitat tipoHabitat;
    private final Integer dimensionId;
    private final Integer sueloId;

    public HabitatEntityDto(int id, TipoHabitat tipoHabitat, Integer dimensionId, Integer sueloId) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.dimensionId = dimensionId;
        this.sueloId = sueloId;
    }

    public int getId() {
        return id;
    }

    public TipoHabitat getTipoHabitat() {
        return tipoHabitat;
    }

    public Integer getDimensionId() {
        return dimensionId;
    }

    public Integer getSueloId() {
        return sueloId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitatEntityDto entity = (HabitatEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tipoHabitat, entity.tipoHabitat) &&
                Objects.equals(this.dimensionId, entity.dimensionId) &&
                Objects.equals(this.sueloId, entity.sueloId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoHabitat, dimensionId, sueloId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tipoHabitat = " + tipoHabitat + ", " +
                "dimensionId = " + dimensionId + ", " +
                "sueloId = " + sueloId + ")";
    }
}
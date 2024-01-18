package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link AcuaticoEntity}
 */
public class AcuaticoEntityDto extends HabitatEntityDto implements Serializable {
    private final TipoAgua tipoAgua;
    private final int id;



    @Default

    public AcuaticoEntityDto(int id,  TipoAgua tipoAgua, int id1) {
        super(id, TipoHabitat.ACTUATICO);
        this.tipoAgua = tipoAgua;
        this.id = id1;
    }

    public TipoAgua getTipoAgua() {
        return tipoAgua;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcuaticoEntityDto entity = (AcuaticoEntityDto) o;
        return Objects.equals(this.tipoAgua, entity.tipoAgua) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoAgua, id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "tipoAgua = " + tipoAgua + ", " +
                "id = " + id + ")";
    }
}
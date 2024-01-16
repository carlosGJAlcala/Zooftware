package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link AcuaticoEntity}
 */
public class AcuaticoEntityDto implements Serializable {
    private final TipoAgua tipoAgua;
    private final int id;

    public AcuaticoEntityDto(TipoAgua tipoAgua, int id) {
        this.tipoAgua = tipoAgua;
        this.id = id;
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
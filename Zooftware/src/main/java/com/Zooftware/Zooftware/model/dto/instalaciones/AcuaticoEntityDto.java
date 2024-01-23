package com.Zooftware.Zooftware.model.dto.instalaciones;

import com.Zooftware.Zooftware.model.dto.Default;
import com.Zooftware.Zooftware.model.entities.instalaciones.AcuaticoEntity;
import com.Zooftware.Zooftware.model.entities.enums.TipoAgua;
import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link AcuaticoEntity}
 */
public class AcuaticoEntityDto extends HabitatEntityDto implements Serializable {
    private TipoAgua tipoAgua;
    private  int id;

@Default
    public AcuaticoEntityDto(TipoHabitat tipoHabitat, TipoAgua tipoAgua) {
        super(tipoHabitat);
        this.tipoAgua = tipoAgua;
    }

    public AcuaticoEntityDto(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public TipoAgua getTipoAgua() {
        return this.tipoAgua;
    }

    public void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
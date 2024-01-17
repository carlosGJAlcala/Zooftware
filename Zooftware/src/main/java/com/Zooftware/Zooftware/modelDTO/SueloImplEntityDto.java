package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoSuelo;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.SueloImplEntity}
 */
public class SueloImplEntityDto implements Serializable {
    private final int id;
    private final int porcentajeHumedad;
    private final TipoSuelo tipo;

    public SueloImplEntityDto(int id, int porcentajeHumedad, TipoSuelo tipo) {
        this.id = id;
        this.porcentajeHumedad = porcentajeHumedad;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public int getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    public TipoSuelo getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SueloImplEntityDto entity = (SueloImplEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.porcentajeHumedad, entity.porcentajeHumedad) &&
                Objects.equals(this.tipo, entity.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, porcentajeHumedad, tipo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "porcentajeHumedad = " + porcentajeHumedad + ", " +
                "tipo = " + tipo + ")";
    }
}
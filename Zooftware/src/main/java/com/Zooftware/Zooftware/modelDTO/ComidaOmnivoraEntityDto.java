package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.ComidaOmnivoraEntity}
 */
public class ComidaOmnivoraEntityDto implements Serializable {
    private final int id;
    private final Object estado;

    public ComidaOmnivoraEntityDto(int id, Object estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public Object getEstado() {
        return estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComidaOmnivoraEntityDto entity = (ComidaOmnivoraEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.estado, entity.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estado);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "estado = " + estado + ")";
    }
}
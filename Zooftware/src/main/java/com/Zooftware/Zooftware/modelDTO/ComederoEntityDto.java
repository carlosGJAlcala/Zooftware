package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.ComederoEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link ComederoEntity}
 */
public class ComederoEntityDto implements Serializable {
    private final int id;
    private final Integer idHabita;
    private final Integer cantidad;

    public ComederoEntityDto(int id, Integer idHabita, Integer cantidad) {
        this.id = id;
        this.idHabita = idHabita;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public Integer getIdHabita() {
        return idHabita;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComederoEntityDto entity = (ComederoEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.idHabita, entity.idHabita) &&
                Objects.equals(this.cantidad, entity.cantidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idHabita, cantidad);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "idHabita = " + idHabita + ", " +
                "cantidad = " + cantidad + ")";
    }
}
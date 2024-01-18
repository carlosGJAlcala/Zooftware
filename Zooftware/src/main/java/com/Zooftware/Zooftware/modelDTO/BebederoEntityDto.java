package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.BebederoEntity}
 */
public class BebederoEntityDto implements Serializable {
    private final int id;
    private final Integer bebederoId;

    private int cantidad;


    public BebederoEntityDto(int id, Integer bebederoId) {
        this.id = id;
        this.bebederoId = bebederoId;
    }

    public int getId() {
        return id;
    }

    public Integer getBebederoId() {
        return bebederoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BebederoEntityDto entity = (BebederoEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.bebederoId, entity.bebederoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bebederoId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "bebederoId = " + bebederoId + ")";
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
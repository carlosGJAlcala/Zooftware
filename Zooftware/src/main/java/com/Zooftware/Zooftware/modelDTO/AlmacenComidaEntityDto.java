package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity}
 */
public class AlmacenComidaEntityDto implements Serializable {
    private final int id;

    public AlmacenComidaEntityDto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlmacenComidaEntityDto entity = (AlmacenComidaEntityDto) o;
        return Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }

    /**
     * DTO for {@link com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity}
     */

}
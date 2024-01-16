package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.DimensionEntity}
 */
public class DimensionEntityDto implements Serializable {
    private final int id;
    private final int area;

    public DimensionEntityDto(int id, int area) {
        this.id = id;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public int getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DimensionEntityDto entity = (DimensionEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.area, entity.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, area);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "area = " + area + ")";
    }
}
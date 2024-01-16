package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.TerrestreEntity}
 */
public class TerrestreEntityDto implements Serializable {
    private final int numBebederos;
    private final int numComederos;
    private final String nombre;
    private final int id;

    public TerrestreEntityDto(int numBebederos, int numComederos, String nombre, int id) {
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
        this.nombre = nombre;
        this.id = id;
    }

    public int getNumBebederos() {
        return numBebederos;
    }

    public int getNumComederos() {
        return numComederos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TerrestreEntityDto entity = (TerrestreEntityDto) o;
        return Objects.equals(this.numBebederos, entity.numBebederos) &&
                Objects.equals(this.numComederos, entity.numComederos) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numBebederos, numComederos, nombre, id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "numBebederos = " + numBebederos + ", " +
                "numComederos = " + numComederos + ", " +
                "nombre = " + nombre + ", " +
                "id = " + id + ")";
    }
}
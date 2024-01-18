package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.AnfibioEntity}
 */
public class AnfibioEntityDto  extends HabitatEntityDto implements Serializable {
    private final int numComedores;
    private final int id;

    public AnfibioEntityDto(int id, int numComedores, int id1) {
        super(id, TipoHabitat.ANFIBIO);
        this.numComedores = numComedores;
        this.id = id1;
        super.crearComederos(numComedores, TipoComida.OMNIVORA);
    }

    public int getNumComedores() {
        return numComedores;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnfibioEntityDto entity = (AnfibioEntityDto) o;
        return Objects.equals(this.numComedores, entity.numComedores) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numComedores, id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "numComedores = " + numComedores + ", " +
                "id = " + id + ")";
    }
}
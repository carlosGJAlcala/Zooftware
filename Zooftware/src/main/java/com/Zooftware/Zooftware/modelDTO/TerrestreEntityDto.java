package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.TerrestreEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link TerrestreEntity}
 */
public class TerrestreEntityDto extends HabitatEntityDto implements Serializable {
    private final int numBebederos;
    private final int numComederos;

    private final int id;

    public TerrestreEntityDto(int id, int numBebederos, int numComederos, int id1) {
        super(id, TipoHabitat.TERRESTRE);
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
        super.crearBebederos(numBebederos);
        super.crearComederos(numComederos, TipoComida.OMNIVORA);

        this.id = id1;
    }

    public int getNumBebederos() {
        return numBebederos;
    }

    public int getNumComederos() {
        return numComederos;
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

                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numBebederos, numComederos, id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "numBebederos = " + numBebederos + ", " +
                "numComederos = " + numComederos + ", " +
                "id = " + id + ")";
    }
}
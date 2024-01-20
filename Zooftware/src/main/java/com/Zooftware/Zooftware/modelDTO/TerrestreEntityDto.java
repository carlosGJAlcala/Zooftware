package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.TerrestreEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link TerrestreEntity}
 */
public class TerrestreEntityDto extends HabitatEntityDto implements Serializable {
    private int numBebederos;
    private int numComederos;
    private int id;

    public TerrestreEntityDto(int id, int numBebederos, int numComederos, int id1) {
        super(id, TipoHabitat.TERRESTRE, null, null, null, null);
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
        super.crearBebederos(numBebederos);
        super.crearComederos(numComederos, TipoComida.OMNIVORA);

        this.id = id1;
    }

    @Default
    public TerrestreEntityDto(int id, TipoHabitat tipoHabitat, List<BebederoEntityDto> bebederos, List<ComederoEntityDto> comederos, List<AnimalEntityDto> animales, List<PlantaEntityDto> plantas, int numBebederos, int numComederos, int id1) {
        super(id, tipoHabitat, bebederos, comederos, animales, plantas);
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
        this.id = id1;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getNumBebederos() {
        return numBebederos;
    }

    public void setNumBebederos(int numBebederos) {
        this.numBebederos = numBebederos;
    }

    public int getNumComederos() {
        return numComederos;
    }

    public void setNumComederos(int numComederos) {
        this.numComederos = numComederos;
    }

    @Override
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
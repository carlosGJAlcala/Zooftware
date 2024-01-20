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
    private int id;
    private int numBebederos;
    private int numComederos;

    @Default
    public TerrestreEntityDto(TipoHabitat tipoHabitat, int numBebederos, int numComederos) {
        super(tipoHabitat);
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
    }

    public TerrestreEntityDto(int numBebederos, int numComederos) {
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
    }

    public int getNumBebederos() {
        return numBebederos;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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
}
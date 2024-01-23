package com.Zooftware.Zooftware.model.dto.instalaciones;

import com.Zooftware.Zooftware.model.dto.Default;
import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.entities.instalaciones.TerrestreEntity;

import java.io.Serializable;

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

    public TerrestreEntityDto(int id, int numBebederos, int numComederos) {
        this.id = id;
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
    }

    public int getNumBebederos() {
        return this.numBebederos;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setNumBebederos(int numBebederos) {
        this.numBebederos = numBebederos;
    }

    public int getNumComederos() {
        return this.numComederos;
    }

    public void setNumComederos(int numComederos) {
        this.numComederos = numComederos;
    }
}
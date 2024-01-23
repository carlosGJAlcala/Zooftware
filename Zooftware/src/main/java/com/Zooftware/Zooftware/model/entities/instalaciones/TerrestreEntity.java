package com.Zooftware.Zooftware.model.entities.instalaciones;

import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.entities.organimos.AnimalEntity;
import com.Zooftware.Zooftware.model.entities.organimos.PlantaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "terrestre")
public class TerrestreEntity extends HabitatEntity{

    private int numBebederos;
    private int numComederos;


    public TerrestreEntity() {
    }

    public TerrestreEntity(int numBebederos, int numComederos) {
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
    }

    public TerrestreEntity(TipoHabitat tipoHabitat, List<ComederoEntity> comederos, List<BebederoEntity> bebederos, List<AnimalEntity> animales, List<PlantaEntity> plantas, int numBebederos, int numComederos) {
        super(tipoHabitat, comederos, bebederos, animales, plantas);
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
    }

    public int getNumBebederos() {
        return this.numBebederos;
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

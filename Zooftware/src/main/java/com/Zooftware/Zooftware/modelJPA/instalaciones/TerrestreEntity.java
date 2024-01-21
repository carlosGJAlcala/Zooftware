package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.PlantaEntity;
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
}

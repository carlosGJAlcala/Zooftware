package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelDTO.Default;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.PlantaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "anfibio", schema = "testbbdd", catalog = "")
public class AnfibioEntity extends HabitatEntity{


    private int numComedores;

    public AnfibioEntity(int numComedores) {
        this.numComedores = numComedores;
    }
    @Default
    public AnfibioEntity(TipoHabitat tipoHabitat, List<ComederoEntity> comederos, List<BebederoEntity> bebederos, List<AnimalEntity> animales, List<PlantaEntity> plantas, int numComedores) {
        super(tipoHabitat, comederos, bebederos, animales, plantas);
        this.numComedores = numComedores;
    }

    public int getNumComedores() {
        return this.numComedores;
    }

    public void setNumComedores(int numComedores) {
        this.numComedores = numComedores;
    }

    public AnfibioEntity() {
    }




}

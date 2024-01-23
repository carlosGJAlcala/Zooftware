package com.Zooftware.Zooftware.model.entities.instalaciones;

import com.Zooftware.Zooftware.model.dto.Default;
import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.entities.organimos.AnimalEntity;
import com.Zooftware.Zooftware.model.entities.organimos.PlantaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "anfibio")
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

package com.Zooftware.Zooftware.model.dto.instalaciones;

import com.Zooftware.Zooftware.model.dto.Default;
import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.entities.instalaciones.AnfibioEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * DTO for {@link AnfibioEntity}
 */
public class AnfibioEntityDto  extends HabitatEntityDto implements Serializable {


    private int numComedores;

    public AnfibioEntityDto(int id, int numComedores) {
        super(TipoHabitat.ANFIBIO);
        super.setAnimales(new ArrayList<>());
        super.setPlantas(new ArrayList<>());

        this.numComedores = numComedores;
    }
//
//    @Default
//    public AnfibioEntityDto(int id, TipoHabitat tipoHabitat, List<BebederoEntityDto> bebederos, List<ComederoEntityDto> comederos, List<AnimalEntityDto> animales, List<PlantaEntityDto> plantas, int numComedores, int id1) {
//        super(id, tipoHabitat, bebederos, comederos, animales, plantas);
//        super.setAnimales(new ArrayList<>());
//        super.setPlantas(new ArrayList<>());
//
//        this.numComedores = numComedores;
//        this.id = id1;
//    }
//
//    public AnfibioEntityDto(TipoHabitat tipoHabitat, int numComedores) {
//        super(tipoHabitat);
//        super.setAnimales(new ArrayList<>());
//        super.setPlantas(new ArrayList<>());
//
//        this.numComedores = numComedores;
//    }

    @Default
    public AnfibioEntityDto(TipoHabitat tipoHabitat, int numComedores) {
        super(tipoHabitat);
        this.numComedores = numComedores;
    }

    public AnfibioEntityDto(int numComedores) {
        this.numComedores = numComedores;
    }


    //    @Default
//    public AnfibioEntityDto (int numeroComederos){
//        this.numComedores = numeroComederos;
//    }

//    @
//
//    public AnfibioEntityDto(TipoHabitat tipoHabitat, int numComedores) {
//        super(tipoHabitat);
//        this.numComedores = numComedores;a
//    }

    public int getNumComedores() {
        return numComedores;
    }

    public void setNumComedores(int numComedores) {
        this.numComedores = numComedores;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnfibioEntityDto entity = (AnfibioEntityDto) o;
        return Objects.equals(this.numComedores, entity.numComedores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numComedores);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "numComedores = " + numComedores + ")";
    }
}
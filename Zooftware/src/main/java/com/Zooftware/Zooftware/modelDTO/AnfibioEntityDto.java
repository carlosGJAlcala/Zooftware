package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AnfibioEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link AnfibioEntity}
 */
public class AnfibioEntityDto  extends HabitatEntityDto implements Serializable {


    private int numComedores;

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
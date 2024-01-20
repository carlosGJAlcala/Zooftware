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
    private int id;

    public AnfibioEntityDto(int id, int numComedores, int id1) {
        super(id, TipoHabitat.ANFIBIO, null, null, null, null);
        this.numComedores = numComedores;
        this.id = id1;
        super.crearComederos(numComedores, TipoComida.OMNIVORA);
    }

    @Default
    public AnfibioEntityDto(int id, TipoHabitat tipoHabitat, List<BebederoEntityDto> bebederos, List<ComederoEntityDto> comederos, List<AnimalEntityDto> animales, List<PlantaEntityDto> plantas, int numComedores, int id1) {
        super(id, tipoHabitat, bebederos, comederos, animales, plantas);
        this.numComedores = numComedores;
        this.id = id1;
    }

    public int getNumComedores() {
        return numComedores;
    }

    public void setNumComedores(int numComedores) {
        this.numComedores = numComedores;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnfibioEntityDto entity = (AnfibioEntityDto) o;
        return Objects.equals(this.numComedores, entity.numComedores) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numComedores, id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "numComedores = " + numComedores + ", " +
                "id = " + id + ")";
    }
}
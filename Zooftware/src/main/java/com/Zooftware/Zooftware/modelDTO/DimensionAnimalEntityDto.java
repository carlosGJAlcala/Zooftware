package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.DimensionAnimalEntity}
 */
public class DimensionAnimalEntityDto implements Serializable {
    private final int id;
    private final double altura;
    private final double peso;

    public DimensionAnimalEntityDto(int id, double altura, double peso) {
        this.id = id;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DimensionAnimalEntityDto entity = (DimensionAnimalEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.altura, entity.altura) &&
                Objects.equals(this.peso, entity.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, altura, peso);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "altura = " + altura + ", " +
                "peso = " + peso + ")";
    }
}
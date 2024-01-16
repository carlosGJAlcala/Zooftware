package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.AnimalEntity}
 */
public class AnimalEntityDto implements Serializable {
    private final int hambre;
    private final String nombre;
    private final int numExtremidades;
    private final int salud;
    private final int sed;
    private final int suenio;
    private final Object estadoAnimal;
    private final TipoAnimal tipo;
    private final int id;
    private final Integer comidaId;

    public AnimalEntityDto(int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, Object estadoAnimal, TipoAnimal tipo, int id, Integer comidaId) {
        this.hambre = hambre;
        this.nombre = nombre;
        this.numExtremidades = numExtremidades;
        this.salud = salud;
        this.sed = sed;
        this.suenio = suenio;
        this.estadoAnimal = estadoAnimal;
        this.tipo = tipo;
        this.id = id;
        this.comidaId = comidaId;
    }

    public int getHambre() {
        return hambre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public int getSalud() {
        return salud;
    }

    public int getSed() {
        return sed;
    }

    public int getSuenio() {
        return suenio;
    }

    public Object getEstadoAnimal() {
        return estadoAnimal;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public Integer getComidaId() {
        return comidaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntityDto entity = (AnimalEntityDto) o;
        return Objects.equals(this.hambre, entity.hambre) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.numExtremidades, entity.numExtremidades) &&
                Objects.equals(this.salud, entity.salud) &&
                Objects.equals(this.sed, entity.sed) &&
                Objects.equals(this.suenio, entity.suenio) &&
                Objects.equals(this.estadoAnimal, entity.estadoAnimal) &&
                Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.id, entity.id) &&
                Objects.equals(this.comidaId, entity.comidaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hambre, nombre, numExtremidades, salud, sed, suenio, estadoAnimal, tipo, id, comidaId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "hambre = " + hambre + ", " +
                "nombre = " + nombre + ", " +
                "numExtremidades = " + numExtremidades + ", " +
                "salud = " + salud + ", " +
                "sed = " + sed + ", " +
                "suenio = " + suenio + ", " +
                "estadoAnimal = " + estadoAnimal + ", " +
                "tipo = " + tipo + ", " +
                "id = " + id + ", " +
                "comidaId = " + comidaId + ")";
    }
}
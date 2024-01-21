package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link AnimalEntity}
 */
public class AnimalEntityDto implements Serializable {
    private int id;
    private String nombre;
    private EstadoAnimal estadoAnimal;
    private TipoAnimal tipo;
    private HabitatEntityDto habitat;
    private int numExtremidades;
    private int salud;
    private int sed;
    private int suenio;
    private int hambre;

    @Default
    public AnimalEntityDto(String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, HabitatEntityDto habitat, int numExtremidades, int salud, int sed, int suenio, int hambre) {
        this.nombre = nombre;
        this.estadoAnimal = estadoAnimal;
        this.tipo = tipo;
        this.habitat = habitat;
        this.numExtremidades = numExtremidades;
        this.salud = salud;
        this.sed = sed;
        this.suenio = suenio;
        this.hambre = hambre;
    }

    public AnimalEntityDto() {
    }

    @Override
    public String toString() {
        return "AnimalEntityDto{" +
                "nombre='" + nombre + '\'' +
                ", estadoAnimal=" + estadoAnimal +
                ", tipo=" + tipo +
                ", id=" + id +
                ", habitatEntityDto=" + habitat +
                ", numExtremidades=" + numExtremidades +
                ", salud=" + salud +
                ", sed=" + sed +
                ", suenio=" + suenio +
                ", hambre=" + hambre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntityDto that = (AnimalEntityDto) o;
        return getId() == that.getId() && getNumExtremidades() == that.getNumExtremidades() && getSalud() == that.getSalud() && getSed() == that.getSed() && getSuenio() == that.getSuenio() && getHambre() == that.getHambre() && Objects.equals(getNombre(), that.getNombre()) && getEstadoAnimal() == that.getEstadoAnimal() && getTipo() == that.getTipo() && Objects.equals(getHabitat(), that.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEstadoAnimal(), getTipo(), getId(), getHabitat(), getNumExtremidades(), getSalud(), getSed(), getSuenio(), getHambre());
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoAnimal getEstadoAnimal() {
        return this.estadoAnimal;
    }

    public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public TipoAnimal getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HabitatEntityDto getHabitat() {
        return this.habitat;
    }

    public void setHabitat(HabitatEntityDto habitat) {
        this.habitat = habitat;
    }

    public int getNumExtremidades() {
        return this.numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public int getSalud() {
        return this.salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSed() {
        return this.sed;
    }

    public void setSed(int sed) {
        this.sed = sed;
    }

    public int getSuenio() {
        return this.suenio;
    }

    public void setSuenio(int suenio) {
        this.suenio = suenio;
    }

    public int getHambre() {
        return this.hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }
}
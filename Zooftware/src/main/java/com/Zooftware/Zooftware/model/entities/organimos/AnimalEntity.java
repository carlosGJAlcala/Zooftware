package com.Zooftware.Zooftware.model.entities.organimos;

import com.Zooftware.Zooftware.model.entities.comida.ComidaEntity;
import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;
import com.Zooftware.Zooftware.model.entities.enums.TipoAnimal;
import com.Zooftware.Zooftware.model.entities.instalaciones.HabitatEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "comida_id")
    private ComidaEntity comida;
    private int hambre;
    private String nombre;
    private int numExtremidades;
    private int salud;
    private int sed;
    private int suenio;
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipo;
    @Enumerated(EnumType.STRING)
    private EstadoAnimal estadoAnimal;
    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private HabitatEntity habitat;


    public AnimalEntity(ComidaEntity comida, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo, EstadoAnimal estadoAnimal, HabitatEntity habitat) {
        this.comida = comida;
        this.hambre = hambre;
        this.nombre = nombre;
        this.numExtremidades = numExtremidades;
        this.salud = salud;
        this.sed = sed;
        this.suenio = suenio;
        this.tipo = tipo;
        this.estadoAnimal = estadoAnimal;
        this.habitat = habitat;
    }

    public AnimalEntity(){}


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ComidaEntity getComida() {
        return this.comida;
    }

    public void setComida(ComidaEntity comida) {
        this.comida = comida;
    }

    public int getHambre() {
        return this.hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public TipoAnimal getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public EstadoAnimal getEstadoAnimal() {
        return this.estadoAnimal;
    }

    public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public HabitatEntity getHabitat() {
        return this.habitat;
    }

    public void setHabitat(HabitatEntity habitat) {
        this.habitat = habitat;


    }

    @Override
    public String toString() {
        return "AnimalEntity{" +
                "id=" + id +
                ", comida=" + comida +
                ", hambre=" + hambre +
                ", nombre='" + nombre + '\'' +
                ", numExtremidades=" + numExtremidades +
                ", salud=" + salud +
                ", sed=" + sed +
                ", suenio=" + suenio +
                ", tipo=" + tipo +
                ", estadoAnimal=" + estadoAnimal +
                ", habitat=" + habitat +
                '}';
    }
}

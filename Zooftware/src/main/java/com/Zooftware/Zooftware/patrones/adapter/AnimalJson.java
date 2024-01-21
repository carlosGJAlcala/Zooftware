package com.Zooftware.Zooftware.patrones.adapter;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;

public class AnimalJson {

    private String nombre;

    private EstadoAnimal estadoAnimal;
    private TipoAnimal tipo;

    private int numExtremidades;
    private int salud;
    private int sed;
    private int suenio;
    private int hambre;
    private int id_habita;
    public AnimalJson(String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, int numExtremidades, int salud, int sed, int suenio, int hambre, int id_habita) {
        this.nombre = nombre;
        this.estadoAnimal = estadoAnimal;
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.salud = salud;
        this.sed = sed;
        this.suenio = suenio;
        this.hambre = hambre;
        this.id_habita = id_habita;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoAnimal getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }


    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSed() {
        return sed;
    }

    public void setSed(int sed) {
        this.sed = sed;
    }

    public int getSuenio() {
        return suenio;
    }

    public void setSuenio(int suenio) {
        this.suenio = suenio;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getId_habita() {
        return id_habita;
    }

    public void setId_habita(int id_habita) {
        this.id_habita = id_habita;
    }
}

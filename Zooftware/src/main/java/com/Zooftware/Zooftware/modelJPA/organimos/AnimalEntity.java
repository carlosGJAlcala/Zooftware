package com.Zooftware.Zooftware.modelJPA.organimos;

import com.Zooftware.Zooftware.modelJPA.ComidaEntity;
import com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import jakarta.persistence.*;

@Entity
@Table(name = "animal", schema = "testbbdd", catalog = "")
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "comida_id")
    private ComidaEntity comida;
    private int Hambre;
    private String Nombre;
    private int NumExtremidades;
    private int Salud;
    private int Sed;
    private int Suenio;
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipo;

    public AnimalEntity(int id, ComidaEntity comida, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo) {
        this.id = id;
        this.comida = comida;
        Hambre = hambre;
        Nombre = nombre;
        NumExtremidades = numExtremidades;
        Salud = salud;
        Sed = sed;
        Suenio = suenio;
        this.tipo = tipo;
    }

    public AnimalEntity(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ComidaEntity getComida() {
        return comida;
    }

    public void setComida(ComidaEntity comida) {
        this.comida = comida;
    }

    public int getHambre() {
        return Hambre;
    }

    public void setHambre(int hambre) {
        Hambre = hambre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumExtremidades() {
        return NumExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        NumExtremidades = numExtremidades;
    }

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int salud) {
        Salud = salud;
    }

    public int getSed() {
        return Sed;
    }

    public void setSed(int sed) {
        Sed = sed;
    }

    public int getSuenio() {
        return Suenio;
    }

    public void setSuenio(int suenio) {
        Suenio = suenio;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }


}

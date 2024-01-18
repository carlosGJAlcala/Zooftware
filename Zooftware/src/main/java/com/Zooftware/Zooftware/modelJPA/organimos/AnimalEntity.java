package com.Zooftware.Zooftware.modelJPA.organimos;

import com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity;
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
    private int hambre;
    private String nombre;
    private int numExtremidades;
    private int salud;
    private int sed;
    private int suenio;
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipo;

    public AnimalEntity(int id, ComidaEntity comida, int hambre, String nombre, int numExtremidades, int salud, int sed, int suenio, TipoAnimal tipo) {
        this.id = id;
        this.comida = comida;
        hambre = hambre;
        nombre = nombre;
        numExtremidades = numExtremidades;
        salud = salud;
        sed = sed;
        suenio = suenio;
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
        return hambre;
    }

    public void setHambre(int hambre) {
        hambre = hambre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        numExtremidades = numExtremidades;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        salud = salud;
    }

    public int getSed() {
        return sed;
    }

    public void setSed(int sed) {
        sed = sed;
    }

    public int getS() {
        return suenio;
    }

    public void setS(int s) {
        this.suenio = s;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }


}

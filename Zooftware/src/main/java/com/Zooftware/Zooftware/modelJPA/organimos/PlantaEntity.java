package com.Zooftware.Zooftware.modelJPA.organimos;

import jakarta.persistence.*;

@Entity
@Table(name = "planta", schema = "testbbdd", catalog = "")
public class PlantaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    private String nombre;

    public PlantaEntity(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public PlantaEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

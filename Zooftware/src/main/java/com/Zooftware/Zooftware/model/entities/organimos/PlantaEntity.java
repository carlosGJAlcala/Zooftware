package com.Zooftware.Zooftware.model.entities.organimos;

import com.Zooftware.Zooftware.model.entities.instalaciones.HabitatEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "planta", schema = "testbbdd", catalog = "")
public class PlantaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private HabitatEntity habitat;

    public PlantaEntity(){}

    public PlantaEntity(String nombre, HabitatEntity habitat) {
        this.nombre = nombre;
        this.habitat = habitat;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HabitatEntity getHabitatEntity() {
        return this.habitat;
    }

    public void setHabitatEntity(HabitatEntity habitat) {
        this.habitat = habitat;
    }
}

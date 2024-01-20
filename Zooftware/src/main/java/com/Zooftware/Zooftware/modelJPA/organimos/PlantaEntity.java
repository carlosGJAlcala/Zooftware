package com.Zooftware.Zooftware.modelJPA.organimos;

import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
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
    private HabitatEntity habitatEntity;

    public PlantaEntity(){}

    public PlantaEntity(String nombre, HabitatEntity habitatEntity) {
        this.nombre = nombre;
        this.habitatEntity = habitatEntity;
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

    public HabitatEntity getHabitatEntity() {
        return habitatEntity;
    }

    public void setHabitatEntity(HabitatEntity habitatEntity) {
        this.habitatEntity = habitatEntity;
    }
}

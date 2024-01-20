package com.Zooftware.Zooftware.modelJPA.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "bebedero")
public class BebederoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private HabitatEntity habitatEntity;



    public BebederoEntity(int cantidad, HabitatEntity habitatEntity) {
        this.cantidad = cantidad;
        this.habitatEntity = habitatEntity;
    }

    public BebederoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public HabitatEntity getHabitatEntity() {
        return habitatEntity;
    }

    public void setHabitatEntity(HabitatEntity habitatEntity) {
        this.habitatEntity = habitatEntity;
    }
}

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
    private HabitatEntity habitat;



    public BebederoEntity(int cantidad, HabitatEntity habitat) {
        this.cantidad = cantidad;
        this.habitat = habitat;
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

    public HabitatEntity getHabitat() {
        return habitat;
    }

    public void setHabitat(HabitatEntity habitat) {
        this.habitat = habitat;
    }
}

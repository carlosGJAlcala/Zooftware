package com.Zooftware.Zooftware.modelJPA.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "bebedero", schema = "testbbdd", catalog = "")
public class BebederoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    private int cantidad;

    public BebederoEntity(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public BebederoEntity(int id) {
        this.id = id;
    }

    public BebederoEntity() {
    }
}

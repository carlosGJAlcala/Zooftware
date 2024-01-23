package com.Zooftware.Zooftware.model.entities.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "almacen")
public class AlmacenComidaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;


    //@OneToMany(mappedBy = "almacenComida")

  /*  private List<ComidaEntity> provisiones;*/


    public AlmacenComidaEntity() {
    }

    public AlmacenComidaEntity(int id) {
        this.id = id;

    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

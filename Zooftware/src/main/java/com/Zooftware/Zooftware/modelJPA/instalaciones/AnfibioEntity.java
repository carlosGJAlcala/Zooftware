package com.Zooftware.Zooftware.modelJPA.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "anfibio", schema = "testbbdd", catalog = "")
public class AnfibioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numComedores;

    public AnfibioEntity(int id, int numComedores) {
        this.id = id;
        numComedores = numComedores;
    }

    public AnfibioEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumComedores() {
        return numComedores;
    }

    public void setNumComedores(int numComedores) {
        numComedores = numComedores;
    }
}

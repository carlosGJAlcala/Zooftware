package com.Zooftware.Zooftware.modelJPA.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "anfibio", schema = "testbbdd", catalog = "")
public class AnfibioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int NumComedores;

    public AnfibioEntity(int id, int numComedores) {
        this.id = id;
        NumComedores = numComedores;
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
        return NumComedores;
    }

    public void setNumComedores(int numComedores) {
        NumComedores = numComedores;
    }
}

package com.Zooftware.Zooftware.modelJPA.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "terrestre", schema = "testbbdd", catalog = "")
public class TerrestreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private int numBebederos;
    private int numComederos;
    private String nombre;


    public TerrestreEntity() {
    }

    public TerrestreEntity(int numBebederos, int numComederos, String nombre, int id) {
        this.numBebederos = numBebederos;
        this.numComederos = numComederos;
        this.nombre = nombre;
        this.id = id;
    }

    public int getNumBebederos() {
        return numBebederos;
    }

    public void setNumBebederos(int numBebederos) {
        this.numBebederos = numBebederos;
    }

    public int getNumComederos() {
        return numComederos;
    }

    public void setNumComederos(int numComederos) {
        this.numComederos = numComederos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "terrestre", schema = "testbbdd", catalog = "")
public class TerrestreEntity {
    @Basic
    @Column(name = "num_bebederos")
    private int numBebederos;
    @Basic
    @Column(name = "num_comederos")
    private int numComederos;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TerrestreEntity that = (TerrestreEntity) o;

        if (numBebederos != that.numBebederos) return false;
        if (numComederos != that.numComederos) return false;
        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numBebederos;
        result = 31 * result + numComederos;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}

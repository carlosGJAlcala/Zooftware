package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "anfibio", schema = "testbbdd", catalog = "")
public class AnfibioEntity {
    @Basic
    @Column(name = "num_comedores")
    private int numComedores;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public int getNumComedores() {
        return numComedores;
    }

    public void setNumComedores(int numComedores) {
        this.numComedores = numComedores;
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

        AnfibioEntity that = (AnfibioEntity) o;

        if (numComedores != that.numComedores) return false;
        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numComedores;
        result = 31 * result + id;
        return result;
    }
}

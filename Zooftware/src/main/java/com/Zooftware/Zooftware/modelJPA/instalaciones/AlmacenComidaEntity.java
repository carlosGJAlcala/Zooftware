package com.Zooftware.Zooftware.modelJPA.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "almacen_comida", schema = "testbbdd", catalog = "")
public class AlmacenComidaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

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

        AlmacenComidaEntity that = (AlmacenComidaEntity) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

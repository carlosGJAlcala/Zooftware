package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "planta", schema = "testbbdd", catalog = "")
public class PlantaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "suelo_id")
    private Integer sueloId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSueloId() {
        return sueloId;
    }

    public void setSueloId(Integer sueloId) {
        this.sueloId = sueloId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlantaEntity that = (PlantaEntity) o;

        if (id != that.id) return false;
        if (sueloId != null ? !sueloId.equals(that.sueloId) : that.sueloId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sueloId != null ? sueloId.hashCode() : 0);
        return result;
    }
}

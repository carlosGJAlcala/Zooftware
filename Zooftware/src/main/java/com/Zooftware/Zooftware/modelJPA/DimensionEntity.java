package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "dimension", schema = "testbbdd", catalog = "")
public class DimensionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "area")
    private int area;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DimensionEntity that = (DimensionEntity) o;

        if (id != that.id) return false;
        if (area != that.area) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + area;
        return result;
    }
}

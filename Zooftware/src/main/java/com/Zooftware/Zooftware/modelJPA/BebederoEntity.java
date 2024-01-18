package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "bebedero", schema = "testbbdd", catalog = "")
public class BebederoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "bebedero_id")
    private Integer bebederoId;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getBebederoId() {
        return bebederoId;
    }

    public void setBebederoId(Integer bebederoId) {
        this.bebederoId = bebederoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BebederoEntity that = (BebederoEntity) o;

        if (id != that.id) return false;
        if (bebederoId != null ? !bebederoId.equals(that.bebederoId) : that.bebederoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bebederoId != null ? bebederoId.hashCode() : 0);
        return result;
    }
}

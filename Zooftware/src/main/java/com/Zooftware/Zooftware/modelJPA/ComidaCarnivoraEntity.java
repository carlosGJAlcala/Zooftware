package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "comida_carnivora", schema = "testbbdd", catalog = "")
public class ComidaCarnivoraEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "estado")
    private Object estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComidaCarnivoraEntity that = (ComidaCarnivoraEntity) o;

        if (id != that.id) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }
}

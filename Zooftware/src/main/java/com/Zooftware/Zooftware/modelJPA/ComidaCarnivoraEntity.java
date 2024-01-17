package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import jakarta.persistence.*;

@Entity
@Table(name = "comida_carnivora", schema = "testbbdd", catalog = "")
public class ComidaCarnivoraEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Enumerated(EnumType.STRING)
    private EstadoComida estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoComida getEstado() {
        return estado;
    }

    public void setEstado(EstadoComida estado) {
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

package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import jakarta.persistence.*;

@Entity
@Table(name = "comedero", schema = "testbbdd", catalog = "")
public class ComederoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "comedero_id")
    private Integer idHabita;
    @Basic
    @Column(name = "cantidad")
    private Integer cantidad;

    @Transient
    private TipoComida tipo;

    public TipoComida getTipo() {
        return tipo;
    }

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdHabita() {
        return idHabita;
    }

    public void setIdHabita(Integer idHabita) {
        this.idHabita = idHabita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComederoEntity that = (ComederoEntity) o;

        if (id != that.id) return false;
        if (idHabita != null ? !idHabita.equals(that.idHabita) : that.idHabita != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idHabita != null ? idHabita.hashCode() : 0);
        return result;
    }
}

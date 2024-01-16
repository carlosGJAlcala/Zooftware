package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import jakarta.persistence.*;

@Entity
@Table(name = "comida", schema = "testbbdd", catalog = "")
public class ComidaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "cantidad")
    private int cantidad;
    @Basic
    @Column(name = "tipo_comida")
    private TipoComida tipoComida;
    @Basic
    @Column(name = "comida_carnivora_id")
    private Integer comidaCarnivoraId;
    @Basic
    @Column(name = "comida_hervibora_id")
    private Integer comidaHerviboraId;
    @Basic
    @Column(name = "comida_omnivora_id")
    private Integer comidaOmnivoraId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    public Integer getComidaCarnivoraId() {
        return comidaCarnivoraId;
    }

    public void setComidaCarnivoraId(Integer comidaCarnivoraId) {
        this.comidaCarnivoraId = comidaCarnivoraId;
    }

    public Integer getComidaHerviboraId() {
        return comidaHerviboraId;
    }

    public void setComidaHerviboraId(Integer comidaHerviboraId) {
        this.comidaHerviboraId = comidaHerviboraId;
    }

    public Integer getComidaOmnivoraId() {
        return comidaOmnivoraId;
    }

    public void setComidaOmnivoraId(Integer comidaOmnivoraId) {
        this.comidaOmnivoraId = comidaOmnivoraId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComidaEntity that = (ComidaEntity) o;

        if (id != that.id) return false;
        if (cantidad != that.cantidad) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (tipoComida != null ? !tipoComida.equals(that.tipoComida) : that.tipoComida != null) return false;
        if (comidaCarnivoraId != null ? !comidaCarnivoraId.equals(that.comidaCarnivoraId) : that.comidaCarnivoraId != null)
            return false;
        if (comidaHerviboraId != null ? !comidaHerviboraId.equals(that.comidaHerviboraId) : that.comidaHerviboraId != null)
            return false;
        if (comidaOmnivoraId != null ? !comidaOmnivoraId.equals(that.comidaOmnivoraId) : that.comidaOmnivoraId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + cantidad;
        result = 31 * result + (tipoComida != null ? tipoComida.hashCode() : 0);
        result = 31 * result + (comidaCarnivoraId != null ? comidaCarnivoraId.hashCode() : 0);
        result = 31 * result + (comidaHerviboraId != null ? comidaHerviboraId.hashCode() : 0);
        result = 31 * result + (comidaOmnivoraId != null ? comidaOmnivoraId.hashCode() : 0);
        return result;
    }
}

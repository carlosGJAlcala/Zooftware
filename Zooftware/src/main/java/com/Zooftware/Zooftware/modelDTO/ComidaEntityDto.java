package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.ComidaEntity}
 */
public class ComidaEntityDto implements Serializable {
    private final int id;
    private final String nombre;
    private final int cantidad;
    private final TipoComida tipoComida;
    private final Integer comidaCarnivoraId;
    private final Integer comidaHerviboraId;
    private final Integer comidaOmnivoraId;

    public ComidaEntityDto(int id, String nombre, int cantidad, TipoComida tipoComida, Integer comidaCarnivoraId, Integer comidaHerviboraId, Integer comidaOmnivoraId) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
        this.comidaCarnivoraId = comidaCarnivoraId;
        this.comidaHerviboraId = comidaHerviboraId;
        this.comidaOmnivoraId = comidaOmnivoraId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public TipoComida getTipoComida() {
        return tipoComida;
    }

    public Integer getComidaCarnivoraId() {
        return comidaCarnivoraId;
    }

    public Integer getComidaHerviboraId() {
        return comidaHerviboraId;
    }

    public Integer getComidaOmnivoraId() {
        return comidaOmnivoraId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComidaEntityDto entity = (ComidaEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.cantidad, entity.cantidad) &&
                Objects.equals(this.tipoComida, entity.tipoComida) &&
                Objects.equals(this.comidaCarnivoraId, entity.comidaCarnivoraId) &&
                Objects.equals(this.comidaHerviboraId, entity.comidaHerviboraId) &&
                Objects.equals(this.comidaOmnivoraId, entity.comidaOmnivoraId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, cantidad, tipoComida, comidaCarnivoraId, comidaHerviboraId, comidaOmnivoraId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ", " +
                "cantidad = " + cantidad + ", " +
                "tipoComida = " + tipoComida + ", " +
                "comidaCarnivoraId = " + comidaCarnivoraId + ", " +
                "comidaHerviboraId = " + comidaHerviboraId + ", " +
                "comidaOmnivoraId = " + comidaOmnivoraId + ")";
    }
}
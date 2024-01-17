package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.ComidaEntity}
 */
public class ComidaEntityDto implements Serializable {
    private  int id;
    private  String nombre;
    private  int cantidad;
    private  TipoComida tipoComida;
    private  Integer comidaCarnivoraId;
    private  Integer comidaHerviboraId;
    private  Integer comidaOmnivoraId;
    private EstadoComida estadoComida;



    private String IngredientePrincipal,IngredienteSecundario;

    public ComidaEntityDto(int id, String nombre, int cantidad, TipoComida tipoComida, Integer comidaCarnivoraId, Integer comidaHerviboraId, Integer comidaOmnivoraId) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
        this.comidaCarnivoraId = comidaCarnivoraId;
        this.comidaHerviboraId = comidaHerviboraId;
        this.comidaOmnivoraId = comidaOmnivoraId;
    }

    public ComidaEntityDto() {
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
    public void setEstadoComida(EstadoComida estadoComida) {
        this.estadoComida = estadoComida;
    }


    public void setIngredientePrincipal(String ingredientePrincipal) {
        IngredientePrincipal = ingredientePrincipal;
    }

    public void setIngredienteSecundario(String ingredienteSecundario) {
        IngredienteSecundario = ingredienteSecundario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setComidaCarnivoraId(Integer comidaCarnivoraId) {
        this.comidaCarnivoraId = comidaCarnivoraId;
    }

    public void setComidaHerviboraId(Integer comidaHerviboraId) {
        this.comidaHerviboraId = comidaHerviboraId;
    }

    public void setComidaOmnivoraId(Integer comidaOmnivoraId) {
        this.comidaOmnivoraId = comidaOmnivoraId;
    }
}
package com.Zooftware.Zooftware.model.dto.comida;

import com.Zooftware.Zooftware.model.entities.enums.EstadoComida;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;
import com.Zooftware.Zooftware.model.entities.comida.ComidaEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link ComidaEntity}
 */
public class ComidaEntityDto implements Serializable {
    private  int id;
    private  String nombre;
    private  int cantidad;
    private  TipoComida tipoComida;


    private EstadoComida estadoComida;


    private ComederoEntityDto comederoEntity;
    private String IngredientePrincipal,IngredienteSecundario;

    public ComidaEntityDto(int id, String nombre, int cantidad, TipoComida tipoComida,  EstadoComida estadoComida, String ingredientePrincipal, String ingredienteSecundario,
                           ComederoEntityDto comederoEntity) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
        this.estadoComida = estadoComida;
        IngredientePrincipal = ingredientePrincipal;
        IngredienteSecundario = ingredienteSecundario;
        this.comederoEntity = comederoEntity;
    }

    public EstadoComida getEstadoComida() {
        return this.estadoComida;
    }

    public void setEstadoComida(EstadoComida estadoComida) {
        this.estadoComida = estadoComida;
    }



    public ComidaEntityDto() {
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public TipoComida getTipoComida() {
        return this.tipoComida;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComidaEntityDto entity = (ComidaEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.cantidad, entity.cantidad) &&
                Objects.equals(this.tipoComida, entity.tipoComida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, cantidad, tipoComida);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ", " +
                "cantidad = " + cantidad + ", " +
                "tipoComida = " + tipoComida ;
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

    public ComederoEntityDto getComederoEntity() {
        return comederoEntity;
    }

    public void setComederoEntity(ComederoEntityDto comederoEntity) {
        this.comederoEntity = comederoEntity;
    }
}
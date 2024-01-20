package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.patrones.state.Estado;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity}
 */
public class ComidaEntityDto implements Serializable {
    private  int id;
    private  String nombre;
    private  int cantidad;
    private  TipoComida tipoComida;

    private AlmacenComidaEntityDto almacenComidaEntityDto;

    private EstadoComida estadoComida;

    private String IngredientePrincipal,IngredienteSecundario;

    public ComidaEntityDto(int id, String nombre, int cantidad, TipoComida tipoComida, AlmacenComidaEntityDto almacenComidaEntityDto, EstadoComida estadoComida, String ingredientePrincipal, String ingredienteSecundario) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
        this.almacenComidaEntityDto = almacenComidaEntityDto;
        this.estadoComida = estadoComida;
        IngredientePrincipal = ingredientePrincipal;
        IngredienteSecundario = ingredienteSecundario;
    }

    public EstadoComida getEstadoComida() {
        return estadoComida;
    }

    public void setEstadoComida(EstadoComida estadoComida) {
        this.estadoComida = estadoComida;
    }

    public AlmacenComidaEntityDto getAlmacenComidaEntityDto() {
        return almacenComidaEntityDto;
    }

    public void setAlmacenComidaEntityDto(AlmacenComidaEntityDto almacenComidaEntityDto) {
        this.almacenComidaEntityDto = almacenComidaEntityDto;
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


}
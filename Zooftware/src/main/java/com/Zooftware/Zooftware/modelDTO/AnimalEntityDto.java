package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link AnimalEntity}
 */
public class AnimalEntityDto implements Serializable {
    private final String nombre;

    private final EstadoAnimal estadoAnimal;
    private final TipoAnimal tipo;
    private  int id;




@Default
    public AnimalEntityDto( String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, int id) {
        this.nombre = nombre;
        this.estadoAnimal = estadoAnimal;
        this.tipo = tipo;
        this.id = id;



    }

    public AnimalEntityDto( String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo) {
        this.nombre = nombre;
        this.estadoAnimal = estadoAnimal;
        this.tipo = tipo;



    }
    public String getNombre() {
        return nombre;
    }




    public EstadoAnimal getEstadoAnimal() {
        return estadoAnimal;
    }


    public int getId() {
        return id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntityDto entity = (AnimalEntityDto) o;
        return
                Objects.equals(this.nombre, entity.nombre) &&

                Objects.equals(this.estadoAnimal, entity.estadoAnimal) &&
                Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash( nombre, estadoAnimal, tipo, id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nombre = " + nombre + ", " +
                "estadoAnimal = " + estadoAnimal + ", " +
                "tipo = " + tipo + ", " +
                "id = " + id ;
    }




}
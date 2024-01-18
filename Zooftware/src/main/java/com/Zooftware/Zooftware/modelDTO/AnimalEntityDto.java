package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import com.Zooftware.Zooftware.patrones.state.Estado;
import com.Zooftware.Zooftware.patrones.state.EstadoComida;
import com.Zooftware.Zooftware.patrones.state.EstadoSalud;
import com.Zooftware.Zooftware.patrones.state.EstadoSuenio;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.AnimalEntity}
 */
public class AnimalEntityDto implements Serializable {
    private final int hambre;
    private final String nombre;
    private final int numExtremidades;
    private  int salud;
    private  int comida;
    private  int suenio;
    private final EstadoAnimal estadoAnimal;
    private final TipoAnimal tipo;
    private final int id;
    private final Integer comidaId;

    private Estado estadoActual; // Estado actual




    public AnimalEntityDto(int hambre, String nombre, int numExtremidades, EstadoAnimal estadoAnimal, TipoAnimal tipo, int id, Integer comidaId) {
        this.hambre = hambre;
        this.nombre = nombre;
        this.numExtremidades = numExtremidades;
        this.estadoAnimal = estadoAnimal;
        this.tipo = tipo;
        this.id = id;
        this.comidaId = comidaId;
        this.comida = 50;
        this.salud = 50;
        this.suenio = 0;
    }

    public int getHambre() {
        return hambre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public int getSalud() {
        return salud;
    }

    public int getComida() {
        return comida;
    }

    public int getSuenio() {
        return suenio;
    }

    public EstadoAnimal getEstadoAnimal() {
        return estadoAnimal;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public Integer getComidaId() {
        return comidaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntityDto entity = (AnimalEntityDto) o;
        return Objects.equals(this.hambre, entity.hambre) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.numExtremidades, entity.numExtremidades) &&
                Objects.equals(this.salud, entity.salud) &&
                Objects.equals(this.comida, entity.comida) &&
                Objects.equals(this.suenio, entity.suenio) &&
                Objects.equals(this.estadoAnimal, entity.estadoAnimal) &&
                Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.id, entity.id) &&
                Objects.equals(this.comidaId, entity.comidaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hambre, nombre, numExtremidades, salud, comida, suenio, estadoAnimal, tipo, id, comidaId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "hambre = " + hambre + ", " +
                "nombre = " + nombre + ", " +
                "numExtremidades = " + numExtremidades + ", " +
                "salud = " + salud + ", " +
                "sed = " + comida + ", " +
                "suenio = " + suenio + ", " +
                "estadoAnimal = " + estadoAnimal + ", " +
                "tipo = " + tipo + ", " +
                "id = " + id + ", " +
                "comidaId = " + comidaId + ")";
    }

    public void darComida(int cantidad) {
        this.comida += cantidad;
        if (comida > 100) {
            comida = 100;
        } else if (comida < 0) {
            comida = 0;
        }
        estadoActual = new EstadoComida();
        estadoActual.ejecutar(this);
        resultado();
    }

    /**
     * Incrementa el indicador de salud en la cantidad pasada como argumento. Si
     * el resultado es mayor que 100, se establece el indicador a 100. Si el
     * resultado es menor que 0, se establece el indicador a 0.
     *
     * @param cantidad
     */
    public void hacerEjercicio(int cantidad) {
        salud += cantidad;
        if (salud > 100) {
            salud = 100;
        } else if (salud < 0) {
            salud = 0;
        }
        estadoActual = new EstadoSalud();
        estadoActual.ejecutar(this);
        resultado();
    }

    /**
     * Decrementa el indicador de sueño en la cantidad pasada como argumento. Si
     * el resultado es mayor que 100, se establece el indicador a 100. Si el
     * resultado es menor que 0, se establece el indicador a 0.
     *
     * @param cantidad
     */
    public void dormir(int cantidad) {
        suenio -= cantidad;
        if (suenio > 100) {
            suenio = 100;
        } else if (suenio < 0) {
            suenio = 0;
        }
        estadoActual = new EstadoSuenio();
        estadoActual.ejecutar(this);
        resultado();
    }

    /**
     * Muestra el estado final.
     */
    public void resultado() {
        estadoActual.ejecutar(this); //comprobamos el estado final
    }


    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

}
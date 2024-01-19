package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.persona.EmpleadoEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link EmpleadoEntity}
 */
public class EmpleadoEntityDto extends  TrabajadorEntityDto implements Serializable {
    private int id;

    public EmpleadoEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, EmpleadoEntityDto empleadoZooId, JefeEntityDto jefeId, double salario, int id2) {
        super(id, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, salario);
        this.id=id2;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoEntityDto entity = (EmpleadoEntityDto) o;
        return Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }

    @Override
    public void aniadirSubordinado(TrabajadorEntityDto t) {

    }

    @Override
    public void eliminarSubordinado(TrabajadorEntityDto t) {

    }

    @Override
    public double getSalarios() {
        return 0;
    }

    @Override
    public String getDescripcion() {
        return null;
    }
}
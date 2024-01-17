package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.TrabajadorEntity}
 */
public abstract class TrabajadorEntityDto implements Serializable {
    private final int id;
    private final boolean activo;
    private final Timestamp fechaFinContrato;
    private final Timestamp fechaInicioContrato;
    private final long numeroSeguridadSocial;
    private final Integer empleadoZooId;
    private final Integer jefeId;
    private final Integer trabajadorId;

    private double salario;

    private String puesto;


    public TrabajadorEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId, double salario, String puesto) {
        this.id = id;
        this.activo = activo;
        this.fechaFinContrato = fechaFinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.empleadoZooId = empleadoZooId;
        this.jefeId = jefeId;
        this.trabajadorId = trabajadorId;
        this.salario = salario;
        this.puesto = puesto;
    }
    public int getId() {
        return id;
    }

    public boolean getActivo() {
        return activo;
    }

    public Timestamp getFechaFinContrato() {
        return fechaFinContrato;
    }

    public Timestamp getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public Integer getEmpleadoZooId() {
        return empleadoZooId;
    }

    public Integer getJefeId() {
        return jefeId;
    }

    public Integer getTrabajadorId() {
        return trabajadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrabajadorEntityDto entity = (TrabajadorEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.activo, entity.activo) &&
                Objects.equals(this.fechaFinContrato, entity.fechaFinContrato) &&
                Objects.equals(this.fechaInicioContrato, entity.fechaInicioContrato) &&
                Objects.equals(this.numeroSeguridadSocial, entity.numeroSeguridadSocial) &&
                Objects.equals(this.empleadoZooId, entity.empleadoZooId) &&
                Objects.equals(this.jefeId, entity.jefeId) &&
                Objects.equals(this.trabajadorId, entity.trabajadorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, trabajadorId);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "activo = " + activo + ", " +
                "fechaFinContrato = " + fechaFinContrato + ", " +
                "fechaInicioContrato = " + fechaInicioContrato + ", " +
                "numeroSeguridadSocial = " + numeroSeguridadSocial + ", " +
                "empleadoZooId = " + empleadoZooId + ", " +
                "jefeId = " + jefeId + ", " +
                "trabajadorId = " + trabajadorId + ")";
    }

    public abstract void aniadirSubordinado(TrabajadorEntityDto t);

    public abstract void eliminarSubordinado(TrabajadorEntityDto t);

    public abstract double getSalarios();

    public abstract String getDescripcion();

    public boolean isActivo() {
        return activo;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }
}
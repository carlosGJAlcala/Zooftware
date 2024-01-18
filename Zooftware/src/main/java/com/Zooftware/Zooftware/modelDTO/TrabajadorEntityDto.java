package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
import com.Zooftware.Zooftware.patrones.mediator.Mediator;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link TrabajadorEntity}
 */
public abstract class TrabajadorEntityDto implements Serializable {
    private int id;
    private boolean activo;
    private Timestamp fechaFinContrato;
    private Timestamp fechaInicioContrato;
    private long numeroSeguridadSocial;
    private EmpleadoEntityDto empleadoZoo;
    private JefeEntityDto jefeId;
    private List<MensajeEntityDto> mensajes;
    private double salario;


    public void setMediador(Mediator mediador) {
        this.mediador = mediador;
    }



    private Mediator mediador;

    public TrabajadorEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, EmpleadoEntityDto empleadoZooId, JefeEntityDto jefeId, double salario) {
        this.id = id;
        this.activo = activo;
        this.fechaFinContrato = fechaFinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.empleadoZoo = empleadoZooId;
        this.jefeId = jefeId;
        this.salario = salario;
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

    public EmpleadoEntityDto getEmpleadoZooId() {
        return empleadoZoo;
    }

    public JefeEntityDto getJefeId() {
        return jefeId;
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
                Objects.equals(this.empleadoZoo, entity.empleadoZoo) &&
                Objects.equals(this.jefeId, entity.jefeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZoo, jefeId);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "activo = " + activo + ", " +
                "fechaFinContrato = " + fechaFinContrato + ", " +
                "fechaInicioContrato = " + fechaInicioContrato + ", " +
                "numeroSeguridadSocial = " + numeroSeguridadSocial + ", " +
                "empleadoZooId = " + empleadoZoo + ", " +
                "jefeId = " + jefeId + ")";
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


    public Mediator getMediador() {
        return mediador;
    }

    public void enviar(MensajeEntityDto mensaje, int id) {
        this.getMediador().enviar(mensaje, id);
    }


    public void recibir(MensajeEntityDto mensaje) {
        System.out.println("# ColegaConcreto " + getId() + " ha recibido el mensaje:\n" + mensaje);
    }
}
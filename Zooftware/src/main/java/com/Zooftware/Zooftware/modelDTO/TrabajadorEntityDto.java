package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.patrones.mediator.Mediator;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.TrabajadorEntity}
 */
public abstract class TrabajadorEntityDto extends PersonaEntityDto implements Serializable {
    private final int id2;
    private final boolean activo;
    private final Timestamp fechaFinContrato;
    private final Timestamp fechaInicioContrato;
    private final long numeroSeguridadSocial;
    private final Integer empleadoZooId;
    private final Integer jefeId2;
    private final Integer trabajadorId;

    private double salario;

    private String puesto;

    public TrabajadorEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId,
                               int id2, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId2, double salario, String puesto) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId);
        this.id2 = id2;
        this.activo = activo;
        this.fechaFinContrato = fechaFinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.empleadoZooId = empleadoZooId;
        this.jefeId2 = jefeId;
        this.trabajadorId = trabajadorId2;
        this.salario = salario;
        this.puesto = puesto;


    }

    public void setMediador(Mediator mediador) {
        this.mediador = mediador;
    }



    private Mediator mediador;


//    public TrabajadorEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId, double salario, String puesto) {
//        this.id = id;
//        this.activo = activo;
//        this.fechaFinContrato = fechaFinContrato;
//        this.fechaInicioContrato = fechaInicioContrato;
//        this.numeroSeguridadSocial = numeroSeguridadSocial;
//        this.empleadoZooId = empleadoZooId;
//        this.jefeId = jefeId;
//        this.trabajadorId = trabajadorId;
//        this.salario = salario;
//        this.puesto = puesto;
//    }


    public int getId() {
        return id2;
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
        return jefeId2;
    }

    public Integer getTrabajadorId() {
        return trabajadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrabajadorEntityDto entity = (TrabajadorEntityDto) o;
        return Objects.equals(this.id2, entity.id2) &&
                Objects.equals(this.activo, entity.activo) &&
                Objects.equals(this.fechaFinContrato, entity.fechaFinContrato) &&
                Objects.equals(this.fechaInicioContrato, entity.fechaInicioContrato) &&
                Objects.equals(this.numeroSeguridadSocial, entity.numeroSeguridadSocial) &&
                Objects.equals(this.empleadoZooId, entity.empleadoZooId) &&
                Objects.equals(this.jefeId2, entity.jefeId2) &&
                Objects.equals(this.trabajadorId, entity.trabajadorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id2, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId2, trabajadorId);
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id2 + ", " +
                "activo = " + activo + ", " +
                "fechaFinContrato = " + fechaFinContrato + ", " +
                "fechaInicioContrato = " + fechaInicioContrato + ", " +
                "numeroSeguridadSocial = " + numeroSeguridadSocial + ", " +
                "empleadoZooId = " + empleadoZooId + ", " +
                "jefeId = " + jefeId2 + ", " +
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
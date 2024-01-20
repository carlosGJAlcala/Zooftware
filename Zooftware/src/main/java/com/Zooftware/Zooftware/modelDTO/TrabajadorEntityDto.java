package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;
import com.Zooftware.Zooftware.patrones.mediator.Mediator;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link TrabajadorEntity}
 */
public abstract class TrabajadorEntityDto extends PersonaEntityDto implements Serializable {
    //private int id;
    private boolean activo;
    private Date fechaFinContrato;
    private Date fechaInicioContrato;
    private long numeroSeguridadSocial;
    private JefeEntityDto jefeEntityDto;
    private List<MensajeEntityDto> mensajes;
    private double salario;

    public TrabajadorEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, contactoId);
        this.activo = activo;
        this.fechaFinContrato = fechaFinContrato;
        this.fechaInicioContrato = fechaInicioContrato;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.jefeEntityDto = jefeEntityDto;
        this.mensajes = mensajes;
        this.salario = salario;
    }

    private Mediator mediador;
    public void setMediador(Mediator mediador) {

        this.mediador = mediador;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(long numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public JefeEntityDto getJefeEntityDto() {
        return jefeEntityDto;
    }

    public void setJefeEntityDto(JefeEntityDto jefeEntityDto) {
        this.jefeEntityDto = jefeEntityDto;
    }

    public void setMensajes(List<MensajeEntityDto> mensajes) {
        this.mensajes = mensajes;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrabajadorEntityDto that = (TrabajadorEntityDto) o;
        return isActivo() == that.isActivo() && getNumeroSeguridadSocial() == that.getNumeroSeguridadSocial() && Double.compare(getSalario(), that.getSalario()) == 0 && Objects.equals(getFechaFinContrato(), that.getFechaFinContrato()) && Objects.equals(getFechaInicioContrato(), that.getFechaInicioContrato()) && Objects.equals(getJefeEntityDto(), that.getJefeEntityDto()) && Objects.equals(getMensajes(), that.getMensajes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isActivo(), getFechaFinContrato(), getFechaInicioContrato(), getNumeroSeguridadSocial(), getJefeEntityDto(), getMensajes(), getSalario());
    }


    @Override
    public String toString() {
        return "TrabajadorEntityDto{" +
                "activo=" + activo +
                ", fechaFinContrato=" + fechaFinContrato +
                ", fechaInicioContrato=" + fechaInicioContrato +
                ", numeroSeguridadSocial=" + numeroSeguridadSocial +
                ", jefeEntityDto=" + jefeEntityDto +
                ", mensajes=" + mensajes +
                ", salario=" + salario +
                '}';
    }




    public abstract void aniadirSubordinado(TrabajadorEntityDto t);

    public abstract void eliminarSubordinado(TrabajadorEntityDto t);

    public abstract double getSalarios();

    public boolean isActivo() {
        return activo;
    }

    public double getSalario() {
        return salario;
    }


    public Mediator getMediador() {
        return mediador;
    }

    public void enviar(MensajeEntityDto mensaje, String correo) {
        this.getMediador().enviar(mensaje, correo);
    }


    public void recibir(MensajeEntityDto mensaje) {
        System.out.println("# ColegaConcreto " + getId() + " ha recibido el mensaje:\n" + mensaje);
    }
    public List<MensajeEntityDto> getMensajes() {
        return mensajes;
    }

   }

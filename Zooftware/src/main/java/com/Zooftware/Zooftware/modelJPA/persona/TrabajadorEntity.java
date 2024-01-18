package com.Zooftware.Zooftware.modelJPA.persona;

import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "trabajador", schema = "testbbdd", catalog = "")
public class TrabajadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Añadir caracteristicas propias de los trabajadores:
//	numero seguridad social
//	fecha inicio contrato
//	fecha fin contrato
//	fecha Borrado
//	Activo
//
    private long numeroSeguridadSocial;
    private boolean activo;
    private Date fechaInicioContrato;
    private Date fechaFinContrato;
    @OneToMany
    @JoinColumn(name = "mensaje_id")
    private List<MensajeEntity> mensaje;
    @OneToOne
    @JoinColumn(name = "empleadoZoo_id")
    private EmpleadoEntity empleadoZoo;
    @OneToOne
    @JoinColumn(name = "jefe_id")
    private JefeEntity jefe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public TrabajadorEntity() {
    }

    public void setNumeroSeguridadSocial(long numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public List<MensajeEntity> getMensaje() {
        return mensaje;
    }

    public void setMensaje(List<MensajeEntity> mensaje) {
        this.mensaje = mensaje;
    }

    public EmpleadoEntity getEmpleadoZoo() {
        return empleadoZoo;
    }

    public void setEmpleadoZoo(EmpleadoEntity empleadoZoo) {
        this.empleadoZoo = empleadoZoo;
    }

    public JefeEntity getJefe() {
        return jefe;
    }

    public void setJefe(JefeEntity jefe) {
        this.jefe = jefe;
    }
}

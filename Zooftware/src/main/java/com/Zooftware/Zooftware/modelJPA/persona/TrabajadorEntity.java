package com.Zooftware.Zooftware.modelJPA.persona;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "trabajador", schema = "testbbdd", catalog = "")
public abstract class TrabajadorEntity extends PersonaEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private long numeroSeguridadSocial;
    private boolean activo;
    private Date fechaInicioContrato;
    private Date fechaFinContrato;

    @OneToMany(mappedBy = "trabajador")
    private List<MensajeEntity> mensaje;

    private double salario;
    @ManyToOne
    @JoinColumn(name = "jefe_id")
    private JefeEntity jefe;


    public TrabajadorEntity() {
    }

    public TrabajadorEntity(String password,String username,String apellidos,String dni,int edad,String nombre,long numeroSeguridadSocial, boolean activo, Date fechaInicioContrato, Date fechaFinContrato, List<MensajeEntity> mensaje, double salario) {
        super.setDni(dni);
        super.setPassword(password);
        super.setApellidos(apellidos);
        super.setUsername(username);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.activo = activo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.mensaje = mensaje;
        this.salario = salario;

    }

    public TrabajadorEntity(int id, String apellidos, String dni, int edad, String nombre, String username, String password, Rol rol, ContactoEntity contactoEntity, long numeroSeguridadSocial, boolean activo, Date fechaInicioContrato, Date fechaFinContrato, List<MensajeEntity> mensaje, double salario, JefeEntity jefe) {
        super(id, apellidos, dni, edad, nombre, username, password, rol, contactoEntity);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.activo = activo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.mensaje = mensaje;
        this.salario = salario;
        this.jefe = jefe;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
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

}

package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "trabajador", schema = "testbbdd", catalog = "")
public class TrabajadorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "activo")
    private boolean activo;
    @Basic
    @Column(name = "fecha_fin_contrato")
    private Timestamp fechaFinContrato;
    @Basic
    @Column(name = "fecha_inicio_contrato")
    private Timestamp fechaInicioContrato;
    @Basic
    @Column(name = "numero_seguridad_social")
    private long numeroSeguridadSocial;
    @Basic
    @Column(name = "empleado_zoo_id")
    private Integer empleadoZooId;
    @Basic
    @Column(name = "jefe_id")
    private Integer jefeId;
    @Basic
    @Column(name = "trabajador_id")
    private Integer trabajadorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Timestamp getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Timestamp fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public Timestamp getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(Timestamp fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public long getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(long numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public Integer getEmpleadoZooId() {
        return empleadoZooId;
    }

    public void setEmpleadoZooId(Integer empleadoZooId) {
        this.empleadoZooId = empleadoZooId;
    }

    public Integer getJefeId() {
        return jefeId;
    }

    public void setJefeId(Integer jefeId) {
        this.jefeId = jefeId;
    }

    public Integer getTrabajadorId() {
        return trabajadorId;
    }

    public void setTrabajadorId(Integer trabajadorId) {
        this.trabajadorId = trabajadorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrabajadorEntity that = (TrabajadorEntity) o;

        if (id != that.id) return false;
        if (activo != that.activo) return false;
        if (numeroSeguridadSocial != that.numeroSeguridadSocial) return false;
        if (fechaFinContrato != null ? !fechaFinContrato.equals(that.fechaFinContrato) : that.fechaFinContrato != null)
            return false;
        if (fechaInicioContrato != null ? !fechaInicioContrato.equals(that.fechaInicioContrato) : that.fechaInicioContrato != null)
            return false;
        if (empleadoZooId != null ? !empleadoZooId.equals(that.empleadoZooId) : that.empleadoZooId != null)
            return false;
        if (jefeId != null ? !jefeId.equals(that.jefeId) : that.jefeId != null) return false;
        if (trabajadorId != null ? !trabajadorId.equals(that.trabajadorId) : that.trabajadorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (activo ? 1 : 0);
        result = 31 * result + (fechaFinContrato != null ? fechaFinContrato.hashCode() : 0);
        result = 31 * result + (fechaInicioContrato != null ? fechaInicioContrato.hashCode() : 0);
        result = 31 * result + (int) (numeroSeguridadSocial ^ (numeroSeguridadSocial >>> 32));
        result = 31 * result + (empleadoZooId != null ? empleadoZooId.hashCode() : 0);
        result = 31 * result + (jefeId != null ? jefeId.hashCode() : 0);
        result = 31 * result + (trabajadorId != null ? trabajadorId.hashCode() : 0);
        return result;
    }
}

package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "cliente", schema = "testbbdd", catalog = "")
public class ClienteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "fecha_registro")
    private Timestamp fechaRegistro;
    @Basic
    @Column(name = "fecha_ultima_visita")
    private Timestamp fechaUltimaVisita;
    @Basic
    @Column(name = "num_visitas")
    private int numVisitas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Timestamp getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(Timestamp fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    public int getNumVisitas() {
        return numVisitas;
    }

    public void setNumVisitas(int numVisitas) {
        this.numVisitas = numVisitas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteEntity that = (ClienteEntity) o;

        if (id != that.id) return false;
        if (numVisitas != that.numVisitas) return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;
        if (fechaUltimaVisita != null ? !fechaUltimaVisita.equals(that.fechaUltimaVisita) : that.fechaUltimaVisita != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        result = 31 * result + (fechaUltimaVisita != null ? fechaUltimaVisita.hashCode() : 0);
        result = 31 * result + numVisitas;
        return result;
    }
}

package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "cliente", schema = "testbbdd", catalog = "")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fechaRegistro;

    private Date fechaUltimaVisita;

    private int numVisitas;

    public ClienteEntity() {
    }

    public ClienteEntity(int id, Date fechaRegistro, Date fechaUltimaVisita, int numVisitas) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaVisita = fechaUltimaVisita;
        this.numVisitas = numVisitas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(Date fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    public int getNumVisitas() {
        return numVisitas;
    }

    public void setNumVisitas(int numVisitas) {
        this.numVisitas = numVisitas;
    }

}

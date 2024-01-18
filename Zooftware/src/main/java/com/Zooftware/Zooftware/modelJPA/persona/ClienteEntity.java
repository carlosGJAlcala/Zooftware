package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "cliente", schema = "testbbdd", catalog = "")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Timestamp fechaRegistro;

    private Timestamp fechaUltimaVisita;

    private int numVisitas;

    public ClienteEntity() {
    }

    public ClienteEntity(int id, Timestamp fechaRegistro, Timestamp fechaUltimaVisita, int numVisitas) {
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

}

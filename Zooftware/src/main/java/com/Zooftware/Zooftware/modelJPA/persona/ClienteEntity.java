package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "cliente")
public class ClienteEntity extends PersonaEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private Date fechaRegistro;

    private Date fechaUltimaVisita;

    private int numVisitas;

    public ClienteEntity() {
    }

    public ClienteEntity(Date fechaRegistro, Date fechaUltimaVisita, int numVisitas) {
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaVisita = fechaUltimaVisita;
        this.numVisitas = numVisitas;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaUltimaVisita() {
        return this.fechaUltimaVisita;
    }

    public void setFechaUltimaVisita(Date fechaUltimaVisita) {
        this.fechaUltimaVisita = fechaUltimaVisita;
    }

    public int getNumVisitas() {
        return this.numVisitas;
    }

    public void setNumVisitas(int numVisitas) {
        this.numVisitas = numVisitas;
    }

}

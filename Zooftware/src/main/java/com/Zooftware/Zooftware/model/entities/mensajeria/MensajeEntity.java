package com.Zooftware.Zooftware.model.entities.mensajeria;

import com.Zooftware.Zooftware.model.entities.persona.TrabajadorEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "mensaje")
public class MensajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String asunto;
    private String destinario;
    private String remitente;
    private String texto;
    @ManyToOne
    @JoinColumn(name = "trabajador_id")
    private TrabajadorEntity trabajador;

    public MensajeEntity() {
    }

    public MensajeEntity(int id, String asunto, String destinario, String remitente, String texto, TrabajadorEntity trabajador) {
        this.id = id;
        this.asunto = asunto;
        this.destinario = destinario;
        this.remitente = remitente;
        this.texto = texto;
        this.trabajador = trabajador;
    }

    public TrabajadorEntity getTrabajador() {
        return this.trabajador;
    }

    public void setTrabajador(TrabajadorEntity trabajador) {
        this.trabajador = trabajador;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return this.asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDestinario() {
        return this.destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public String getRemitente() {
        return this.remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

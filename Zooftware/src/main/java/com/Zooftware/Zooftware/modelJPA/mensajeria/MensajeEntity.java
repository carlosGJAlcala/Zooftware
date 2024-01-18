package com.Zooftware.Zooftware.modelJPA.mensajeria;

import jakarta.persistence.*;

@Entity
@Table(name = "mensaje", schema = "testbbdd", catalog = "")
public class MensajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String asunto;
    private String destinario;
    private String remitente;
    private String texto;


    public MensajeEntity() {
    }

    public MensajeEntity(int id, String asunto, String destinario, String remitente, String texto) {
        this.id = id;
        this.asunto = asunto;
        this.destinario = destinario;
        this.remitente = remitente;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDestinario() {
        return destinario;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

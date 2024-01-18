package com.Zooftware.Zooftware.modelJPA.mensajeria;

import jakarta.persistence.*;

@Entity
@Table(name = "mensaje", schema = "testbbdd", catalog = "")
public class MensajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Asunto;
    private String Destinario;
    private String Remitente;
    private String Texto;


    public MensajeEntity() {
    }

    public MensajeEntity(int id, String asunto, String destinario, String remitente, String texto) {
        this.id = id;
        Asunto = asunto;
        Destinario = destinario;
        Remitente = remitente;
        Texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String asunto) {
        Asunto = asunto;
    }

    public String getDestinario() {
        return Destinario;
    }

    public void setDestinario(String destinario) {
        Destinario = destinario;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String remitente) {
        Remitente = remitente;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
}

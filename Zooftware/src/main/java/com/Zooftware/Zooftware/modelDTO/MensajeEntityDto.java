package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link MensajeEntity}
 */
public class MensajeEntityDto implements Serializable {
    private int id;
    private String asunto;
    private String destinario;
    private String remitente;
    private String texto;

    public MensajeEntityDto(int id, String asunto, String destinario, String remitente, String texto) {
        this.id = id;
        this.asunto = asunto;
        this.destinario = destinario;
        this.remitente = remitente;
        this.texto = texto;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MensajeEntityDto entity = (MensajeEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.asunto, entity.asunto) &&
                Objects.equals(this.destinario, entity.destinario) &&
                Objects.equals(this.remitente, entity.remitente) &&
                Objects.equals(this.texto, entity.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, asunto, destinario, remitente, texto);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "asunto = " + asunto + ", " +
                "destinario = " + destinario + ", " +
                "remitente = " + remitente + ", " +
                "texto = " + texto +")";
    }
}
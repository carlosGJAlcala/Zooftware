package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link MensajeEntity}
 */
public class MensajeEntityDto implements Serializable {
    private final int id;
    private final String asunto;
    private final String destinario;
    private final String remitente;
    private final String texto;
    private final Integer tareaId;
    private final Integer mensajeId;

    public MensajeEntityDto(int id, String asunto, String destinario, String remitente, String texto, Integer tareaId, Integer mensajeId) {
        this.id = id;
        this.asunto = asunto;
        this.destinario = destinario;
        this.remitente = remitente;
        this.texto = texto;
        this.tareaId = tareaId;
        this.mensajeId = mensajeId;
    }

    public int getId() {
        return id;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getDestinario() {
        return destinario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getTexto() {
        return texto;
    }

    public Integer getTareaId() {
        return tareaId;
    }

    public Integer getMensajeId() {
        return mensajeId;
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
                Objects.equals(this.texto, entity.texto) &&
                Objects.equals(this.tareaId, entity.tareaId) &&
                Objects.equals(this.mensajeId, entity.mensajeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, asunto, destinario, remitente, texto, tareaId, mensajeId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "asunto = " + asunto + ", " +
                "destinario = " + destinario + ", " +
                "remitente = " + remitente + ", " +
                "texto = " + texto + ", " +
                "tareaId = " + tareaId + ", " +
                "mensajeId = " + mensajeId + ")";
    }
}
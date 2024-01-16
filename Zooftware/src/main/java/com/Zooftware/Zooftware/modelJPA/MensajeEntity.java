package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "mensaje", schema = "testbbdd", catalog = "")
public class MensajeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "asunto")
    private String asunto;
    @Basic
    @Column(name = "destinario")
    private String destinario;
    @Basic
    @Column(name = "remitente")
    private String remitente;
    @Basic
    @Column(name = "texto")
    private String texto;
    @Basic
    @Column(name = "tarea_id")
    private Integer tareaId;
    @Basic
    @Column(name = "mensaje_id")
    private Integer mensajeId;

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

    public Integer getTareaId() {
        return tareaId;
    }

    public void setTareaId(Integer tareaId) {
        this.tareaId = tareaId;
    }

    public Integer getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(Integer mensajeId) {
        this.mensajeId = mensajeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MensajeEntity that = (MensajeEntity) o;

        if (id != that.id) return false;
        if (asunto != null ? !asunto.equals(that.asunto) : that.asunto != null) return false;
        if (destinario != null ? !destinario.equals(that.destinario) : that.destinario != null) return false;
        if (remitente != null ? !remitente.equals(that.remitente) : that.remitente != null) return false;
        if (texto != null ? !texto.equals(that.texto) : that.texto != null) return false;
        if (tareaId != null ? !tareaId.equals(that.tareaId) : that.tareaId != null) return false;
        if (mensajeId != null ? !mensajeId.equals(that.mensajeId) : that.mensajeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (asunto != null ? asunto.hashCode() : 0);
        result = 31 * result + (destinario != null ? destinario.hashCode() : 0);
        result = 31 * result + (remitente != null ? remitente.hashCode() : 0);
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        result = 31 * result + (tareaId != null ? tareaId.hashCode() : 0);
        result = 31 * result + (mensajeId != null ? mensajeId.hashCode() : 0);
        return result;
    }
}

package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.ClienteEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link ClienteEntity}
 */
public class ClienteEntityDto implements Serializable {
    private final int id;
    private final Timestamp fechaRegistro;
    private final Timestamp fechaUltimaVisita;
    private final int numVisitas;

    public ClienteEntityDto(int id, Timestamp fechaRegistro, Timestamp fechaUltimaVisita, int numVisitas) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaVisita = fechaUltimaVisita;
        this.numVisitas = numVisitas;
    }

    public int getId() {
        return id;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public Timestamp getFechaUltimaVisita() {
        return fechaUltimaVisita;
    }

    public int getNumVisitas() {
        return numVisitas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntityDto entity = (ClienteEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.fechaRegistro, entity.fechaRegistro) &&
                Objects.equals(this.fechaUltimaVisita, entity.fechaUltimaVisita) &&
                Objects.equals(this.numVisitas, entity.numVisitas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaRegistro, fechaUltimaVisita, numVisitas);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "fechaRegistro = " + fechaRegistro + ", " +
                "fechaUltimaVisita = " + fechaUltimaVisita + ", " +
                "numVisitas = " + numVisitas + ")";
    }
}
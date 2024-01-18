package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link ClienteEntity}
 */
public class ClienteEntityDto extends PersonaEntityDto implements Serializable {
    private final int id2;
    private final Timestamp fechaRegistro;
    private final Timestamp fechaUltimaVisita;
    private final int numVisitas;

    public ClienteEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId,
                            int id2, Timestamp fechaRegistro, Timestamp fechaUltimaVisita, int numVisitas) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId);
        this.id2 = id2;
        this.fechaRegistro = fechaRegistro;
        this.fechaUltimaVisita = fechaUltimaVisita;
        this.numVisitas = numVisitas;
    }

//    public ClienteEntityDto(int id, Timestamp fechaRegistro, Timestamp fechaUltimaVisita, int numVisitas) {
//        this.id = id;
//        this.fechaRegistro = fechaRegistro;
//        this.fechaUltimaVisita = fechaUltimaVisita;
//        this.numVisitas = numVisitas;
//    }





    public int getId() {
        return id2;
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
        return Objects.equals(this.id2, entity.id2) &&
                Objects.equals(this.fechaRegistro, entity.fechaRegistro) &&
                Objects.equals(this.fechaUltimaVisita, entity.fechaUltimaVisita) &&
                Objects.equals(this.numVisitas, entity.numVisitas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id2, fechaRegistro, fechaUltimaVisita, numVisitas);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id2 + ", " +
                "fechaRegistro = " + fechaRegistro + ", " +
                "fechaUltimaVisita = " + fechaUltimaVisita + ", " +
                "numVisitas = " + numVisitas + ")";
    }
}
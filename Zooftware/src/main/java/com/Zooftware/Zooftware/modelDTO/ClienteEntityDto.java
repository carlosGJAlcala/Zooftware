package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.persona.ClienteEntity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link ClienteEntity}
 */
public class ClienteEntityDto extends PersonaEntityDto implements Serializable {
    private Date fechaRegistro;
    private Date fechaUltimaVisita;
    private int numVisitas;

    public ClienteEntityDto( String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ContactoEntityDto contacto, Date fechaRegistro, Date fechaUltimaVisita, int numVisitas) {
        super(apellidos, dni, edad, nombre, password, rol, username, contacto);
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

    @Override
    public String toString() {
        return "ClienteEntityDto{" +
                "fechaRegistro=" + fechaRegistro +
                ", fechaUltimaVisita=" + fechaUltimaVisita +
                ", numVisitas=" + numVisitas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntityDto that = (ClienteEntityDto) o;
        return getNumVisitas() == that.getNumVisitas() && Objects.equals(getFechaRegistro(), that.getFechaRegistro()) && Objects.equals(getFechaUltimaVisita(), that.getFechaUltimaVisita());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFechaRegistro(), getFechaUltimaVisita(), getNumVisitas());
    }
}
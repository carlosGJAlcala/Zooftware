package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.persona.ContactoEntity;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link ContactoEntity}
 */
public class ContactoEntityDto implements Serializable {
    private final int id;
    private final String correo;
    private final String numeroTlf;

    public ContactoEntityDto(int id, String correo, String numeroTlf) {
        this.id = id;
        this.correo = correo;
        this.numeroTlf = numeroTlf;
    }

    public int getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumeroTlf() {
        return numeroTlf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactoEntityDto entity = (ContactoEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.correo, entity.correo) &&
                Objects.equals(this.numeroTlf, entity.numeroTlf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correo, numeroTlf);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "correo = " + correo + ", " +
                "numeroTlf = " + numeroTlf + ")";
    }
}
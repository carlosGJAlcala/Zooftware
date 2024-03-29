package com.Zooftware.Zooftware.model.dto.instalaciones;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.dto.Default;
import com.Zooftware.Zooftware.model.entities.instalaciones.AlmacenComidaEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link AlmacenComidaEntity}
 */
public class AlmacenComidaEntityDto implements Serializable {
    private  int id;


    private List<ComidaEntityDto> provisiones ;

    @Default
    public AlmacenComidaEntityDto(int id) {
        this.id = id;
    }

    public AlmacenComidaEntityDto() {
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlmacenComidaEntityDto entity = (AlmacenComidaEntityDto) o;
        return Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }


    /**
     * DTO for {@link AlmacenComidaEntity}
     */
    public void setProvisiones(List<ComidaEntityDto> provisiones) {
        this.provisiones = provisiones;
    }

    public List<ComidaEntityDto> getProvisiones() {
        return provisiones;
    }
}
package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link AlmacenComidaEntity}
 */
public class AlmacenComidaEntityDto implements Serializable {
    private  int id;


    private List<ComidaEntityDto> provisiones ;

    public AlmacenComidaEntityDto(int id) {
        this.id = id;
        provisiones=new ArrayList<>();
    }

    public AlmacenComidaEntityDto() {
        provisiones=new ArrayList<>();
    }
    public int getId() {
        return id;
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
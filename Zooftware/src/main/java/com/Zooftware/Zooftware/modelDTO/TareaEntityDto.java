package com.Zooftware.Zooftware.modelDTO;


import com.Zooftware.Zooftware.modelJPA.enums.TipoTarea;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.TareaEntity}
 */
public class TareaEntityDto implements Serializable {
    private final int id;
    private final String descripcion;
    private final TipoTarea tipoTarea;

    public TareaEntityDto(int id, String descripcion, TipoTarea tipoTarea) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipoTarea = tipoTarea;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoTarea getTipoTarea() {
        return tipoTarea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TareaEntityDto entity = (TareaEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.descripcion, entity.descripcion) &&
                Objects.equals(this.tipoTarea, entity.tipoTarea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, tipoTarea);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "descripcion = " + descripcion + ", " +
                "tipoTarea = " + tipoTarea + ")";
    }
}
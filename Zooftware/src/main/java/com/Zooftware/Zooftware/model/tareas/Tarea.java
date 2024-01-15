package com.Zooftware.Zooftware.model.tareas;

import com.Zooftware.Zooftware.model.tareas.enums.TipoTarea;
import jakarta.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private TipoTarea tipoTarea;

    private String descripcion;

    public Tarea(){}
    public Tarea(int id, TipoTarea tipoTarea, String descripcion) {
        this.id = id;
        this.tipoTarea = tipoTarea;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoTarea getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(TipoTarea tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

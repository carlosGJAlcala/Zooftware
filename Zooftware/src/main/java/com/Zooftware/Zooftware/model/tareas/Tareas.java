package com.Zooftware.Zooftware.model.tareas;

import com.Zooftware.Zooftware.model.tareas.enums.TipoTarea;
import jakarta.persistence.*;

@Entity
@Table(name = "tarea")
public class Tareas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private TipoTarea tipoTarea;

    private String descripcion;



}

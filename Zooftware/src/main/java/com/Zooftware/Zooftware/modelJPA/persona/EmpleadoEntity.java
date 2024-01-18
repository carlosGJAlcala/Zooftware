package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado", schema = "testbbdd", catalog = "")
public class EmpleadoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public EmpleadoEntity() {
    }

    public EmpleadoEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

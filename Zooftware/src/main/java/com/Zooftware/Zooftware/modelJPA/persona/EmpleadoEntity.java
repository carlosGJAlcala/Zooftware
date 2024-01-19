package com.Zooftware.Zooftware.modelJPA.persona;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado", schema = "testbbdd", catalog = "")
public class EmpleadoEntity extends TrabajadorEntity{
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;


    public EmpleadoEntity() {
    }



}

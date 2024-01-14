package com.Zooftware.Zooftware.model.instalaciones;

import jakarta.persistence.*;

@Entity
@Table(name = "habitat")
public class Terrestre extends Habitat{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;



}

package com.Zooftware.Zooftware.model.entities.persona;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jefe")
public class JefeEntity extends  TrabajadorEntity{
    //Pendiente añadir mas atributos
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;

    @OneToMany(mappedBy = "jefe")
    private List<TrabajadorEntity> subordinado;

    public JefeEntity( List<TrabajadorEntity> subordinado) {
        this.subordinado = subordinado;
    }

    public JefeEntity() {
    }

    public List<TrabajadorEntity> getSubordinado() {
        return this.subordinado;
    }

    public void setSubordinado(List<TrabajadorEntity> subordinado) {
        this.subordinado = subordinado;
    }
}

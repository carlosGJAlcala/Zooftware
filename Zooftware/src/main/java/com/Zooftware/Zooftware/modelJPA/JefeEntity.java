package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "jefe", schema = "testbbdd", catalog = "")
public class JefeEntity {
    //Pendiente añadir mas atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //ejemplo composite

    @OneToMany
    @JoinColumn(name = "trabajador_id")
    private List<TrabajadorEntity> subordinado;

    //Para el patron composite
//	@OneToOne
//	@JoinColumn(name = "trabajador_id")
//	public Trabajador m_Trabajador;


    public JefeEntity(int id, List<TrabajadorEntity> subordinado) {
        this.id = id;
        this.subordinado = subordinado;
    }

    public JefeEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TrabajadorEntity> getSubordinado() {
        return subordinado;
    }

    public void setSubordinado(List<TrabajadorEntity> subordinado) {
        this.subordinado = subordinado;
    }
}

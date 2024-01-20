package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.Array2DHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "almacen")
public class AlmacenComidaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;


    @OneToMany(mappedBy = "almacenComidaEntity")
    private List<ComidaEntity> provisiones;


    public AlmacenComidaEntity() {
    }

    public AlmacenComidaEntity(int id, List<ComidaEntity> provisiones) {
        this.id = id;
        this.provisiones = provisiones;
    }

    public List<ComidaEntity> getProvisiones() {
        return provisiones;
    }

    public void setProvisiones(List<ComidaEntity> provisiones) {
        this.provisiones = provisiones;
    }


    public AlmacenComidaEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

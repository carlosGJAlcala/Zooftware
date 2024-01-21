package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import jakarta.persistence.*;

@Entity
@Table(name = "comedero")
public class ComederoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    private Integer cantidad;

    @Enumerated(EnumType.STRING)
    private TipoComida tipo;

    @OneToOne
    @JoinColumn(name = "comida_id")
    private ComidaEntity comidaEntity;

    @ManyToOne
    @JoinColumn(name = "habitat_id")
    private HabitatEntity habitat;

    public ComederoEntity(){}

    public ComederoEntity(Integer cantidad, TipoComida tipo, HabitatEntity habitat, ComidaEntity comidaEntity) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.habitat = habitat;
        this.comidaEntity = comidaEntity;
    }


    public ComidaEntity getComidaEntity() {
        return comidaEntity;
    }

    public void setComidaEntity(ComidaEntity comidaEntity) {
        this.comidaEntity = comidaEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public TipoComida getTipo() {
        return tipo;
    }

    public void setTipo(TipoComida tipo) {
        this.tipo = tipo;
    }

    public HabitatEntity getHabitat() {
        return habitat;
    }

    public void setHabitat(HabitatEntity habitat) {
        this.habitat = habitat;
    }
}

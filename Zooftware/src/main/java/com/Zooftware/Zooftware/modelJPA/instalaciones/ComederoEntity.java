package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import jakarta.persistence.*;

@Entity
@Table(name = "comedero", schema = "testbbdd", catalog = "")
public class ComederoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private Integer cantidad;

    @Enumerated(EnumType.STRING)
    private TipoComida tipo;

    public ComederoEntity(int id, Integer cantidad, TipoComida tipo) {
        this.id = id;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public ComederoEntity() {
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
}

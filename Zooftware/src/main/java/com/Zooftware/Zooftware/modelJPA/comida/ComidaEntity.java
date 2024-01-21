package com.Zooftware.Zooftware.modelJPA.comida;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;
import com.Zooftware.Zooftware.patrones.state.Estado;
import jakarta.persistence.*;

@Entity
@Table(name = "comida")
public class ComidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int cantidad;
    @Enumerated(EnumType.STRING)
    private TipoComida tipoComida;

    @Enumerated(EnumType.STRING)
    private EstadoComida estadoComida;

    @ManyToOne
    @JoinColumn(name = "almacen_id")
    private AlmacenComidaEntity almacenComida;

    public ComidaEntity(int id, String nombre, int cantidad, TipoComida tipoComida, EstadoComida estadoComida, AlmacenComidaEntity almacenComida) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
        this.estadoComida = estadoComida;
        this.almacenComida = almacenComida;
    }

    public EstadoComida getEstadoComida() {
        return this.estadoComida;
    }

    public void setEstadoComida(EstadoComida estadoComida) {
        this.estadoComida = estadoComida;
    }

    public AlmacenComidaEntity getAlmacenComida() {
        return this.almacenComida;
    }

    public void setAlmacenComida(AlmacenComidaEntity almacenComida) {
        this.almacenComida = almacenComida;
    }

    public ComidaEntity() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoComida getTipoComida() {
        return this.tipoComida;
    }

    public void setTipoComida(TipoComida tipoComida) {
        this.tipoComida = tipoComida;
    }
}

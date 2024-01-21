package com.Zooftware.Zooftware.modelJPA.comida;

import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
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
    @OneToOne
    @JoinColumn(name = "comedero_id")

    private ComederoEntity comederoEntity;


    public ComidaEntity(int id, String nombre, int cantidad, TipoComida tipoComida, EstadoComida estadoComida, ComederoEntity comederoEntity) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoComida = tipoComida;
        this.estadoComida = estadoComida;
        this.comederoEntity = comederoEntity;
    }

    public ComederoEntity getComederoEntity() {
        return comederoEntity;
    }

    public void setComederoEntity(ComederoEntity comederoEntity) {
        this.comederoEntity = comederoEntity;
    }

    public EstadoComida getEstadoComida() {
        return this.estadoComida;
    }

    public void setEstadoComida(EstadoComida estadoComida) {
        this.estadoComida = estadoComida;
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

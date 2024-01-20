package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import jakarta.persistence.*;

@Entity
@Table(name = "acuatico", schema = "testbbdd", catalog = "")
public class AcuaticoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private TipoAgua tipoAgua;

    public AcuaticoEntity() {
    }

    public AcuaticoEntity(int id, TipoAgua tipoAgua) {
        this.id = id;
        this.tipoAgua = tipoAgua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAgua getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}

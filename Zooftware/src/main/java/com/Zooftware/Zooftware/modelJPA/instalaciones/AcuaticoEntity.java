package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import jakarta.persistence.*;

@Entity
@Table(name = "acuatico", schema = "testbbdd", catalog = "")
public class AcuaticoEntity extends HabitatEntity {


    @Enumerated(EnumType.STRING)
    private TipoAgua tipoAgua;

    public AcuaticoEntity() {
    }

    public AcuaticoEntity(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public TipoAgua getTipoAgua() {
        return this.tipoAgua;
    }

    public void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
}

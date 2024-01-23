package com.Zooftware.Zooftware.model.entities.instalaciones;

import com.Zooftware.Zooftware.model.entities.enums.TipoAgua;
import jakarta.persistence.*;

@Entity
@Table(name = "acuatico")
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

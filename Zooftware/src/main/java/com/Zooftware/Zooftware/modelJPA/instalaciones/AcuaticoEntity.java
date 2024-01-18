package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import jakarta.persistence.*;

@Entity
@Table(name = "acuatico", schema = "testbbdd", catalog = "")
public class AcuaticoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public AcuaticoEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AcuaticoEntity(int id) {
        this.id = id;
    }
}

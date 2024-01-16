package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import jakarta.persistence.*;

@Entity
@Table(name = "acuatico", schema = "testbbdd", catalog = "")
public class AcuaticoEntity {
    @Basic
    @Column(name = "tipo_agua")

    private TipoAgua tipoAgua;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    public TipoAgua getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(TipoAgua tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcuaticoEntity that = (AcuaticoEntity) o;

        if (id != that.id) return false;
        if (tipoAgua != null ? !tipoAgua.equals(that.tipoAgua) : that.tipoAgua != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tipoAgua != null ? tipoAgua.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}

package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import jakarta.persistence.*;

@Entity
@Table(name = "habitat", schema = "testbbdd", catalog = "")
public class HabitatEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "tipo_habitat")
    private TipoHabitat tipoHabitat;
    @Basic
    @Column(name = "dimension_id")
    private Integer dimensionId;
    @Basic
    @Column(name = "suelo_id")
    private Integer sueloId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoHabitat getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(TipoHabitat tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public Integer getDimensionId() {
        return dimensionId;
    }

    public void setDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
    }

    public Integer getSueloId() {
        return sueloId;
    }

    public void setSueloId(Integer sueloId) {
        this.sueloId = sueloId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HabitatEntity that = (HabitatEntity) o;

        if (id != that.id) return false;
        if (tipoHabitat != null ? !tipoHabitat.equals(that.tipoHabitat) : that.tipoHabitat != null) return false;
        if (dimensionId != null ? !dimensionId.equals(that.dimensionId) : that.dimensionId != null) return false;
        if (sueloId != null ? !sueloId.equals(that.sueloId) : that.sueloId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tipoHabitat != null ? tipoHabitat.hashCode() : 0);
        result = 31 * result + (dimensionId != null ? dimensionId.hashCode() : 0);
        result = 31 * result + (sueloId != null ? sueloId.hashCode() : 0);
        return result;
    }
}

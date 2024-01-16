package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.TipoSuelo;
import jakarta.persistence.*;

@Entity
@Table(name = "suelo_impl", schema = "testbbdd", catalog = "")
public class SueloImplEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "porcentaje_humedad")
    private int porcentajeHumedad;
    @Basic
    @Column(name = "tipo")
    private TipoSuelo tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    public void setPorcentajeHumedad(int porcentajeHumedad) {
        this.porcentajeHumedad = porcentajeHumedad;
    }

    public TipoSuelo getTipo() {
        return tipo;
    }

    public void setTipo(TipoSuelo tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SueloImplEntity that = (SueloImplEntity) o;

        if (id != that.id) return false;
        if (porcentajeHumedad != that.porcentajeHumedad) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + porcentajeHumedad;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }
}

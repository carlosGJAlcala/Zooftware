package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.patrones.builder.Cocinero;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.HabitatEntity}
 */
public class HabitatEntityDto implements Serializable {
    private final int id;
    private final TipoHabitat tipoHabitat;
    private  Integer dimensionId;

    private List<BebederoEntityDto> bebederos;
    private List<ComederoEntityDto> comederos;



    @Default
    public HabitatEntityDto(int id, TipoHabitat tipoHabitat, Integer dimensionId, Integer sueloId) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.dimensionId = dimensionId;
    }

    public HabitatEntityDto(int id, TipoHabitat tipoHabitat) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.comederos= new ArrayList<>();
        this.bebederos= new ArrayList<>();
    }

    public HabitatEntityDto(int id, TipoHabitat tipoHabitat, Integer dimensionId, Integer sueloId, List<BebederoEntityDto> bebederos, List<ComederoEntityDto> comederos) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.dimensionId = dimensionId;
        this.bebederos = bebederos;
        this.comederos = comederos;
    }

    public List<BebederoEntityDto> getBebederos() {
        return bebederos;
    }

    public List<ComederoEntityDto> getComederos() {
        return comederos;
    }

    public int getId() {
        return id;
    }

    public TipoHabitat getTipoHabitat() {
        return tipoHabitat;
    }

    public Integer getDimensionId() {
        return dimensionId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitatEntityDto entity = (HabitatEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tipoHabitat, entity.tipoHabitat) &&
                Objects.equals(this.dimensionId, entity.dimensionId) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoHabitat, dimensionId);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tipoHabitat = " + tipoHabitat + ", " +
                "dimensionId = " + dimensionId + ", ";
    }

    public void setDimensionId(Integer dimensionId) {
        this.dimensionId = dimensionId;
    }


   void crearBebederos(int numBebederos){
        for(int i=0;i<numBebederos;i++){
            bebederos.add(new BebederoEntityDto(i,id,0));

        }
    }
    void crearComederos(int numComederos, TipoComida tipo){
        for(int i=0;i<numComederos;i++){
           ComederoEntityDto comedero=new ComederoEntityDto(i,id,numComederos,tipo);
            comederos.add(comedero);

        }
    }

    }
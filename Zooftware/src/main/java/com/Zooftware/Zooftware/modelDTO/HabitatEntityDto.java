package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.HabitatEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.PlantaEntity;
import com.Zooftware.Zooftware.patrones.state.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link HabitatEntity}
 */
public class HabitatEntityDto implements Serializable {
    private int id;
    private TipoHabitat tipoHabitat;
    private List<BebederoEntityDto> bebederos;
    private List<ComederoEntityDto> comederos;
    private List<AnimalEntityDto> animales;
    private List<PlantaEntityDto> plantas;




    @Default
    public HabitatEntityDto(int id, TipoHabitat tipoHabitat) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.comederos= new ArrayList<>();
        this.bebederos= new ArrayList<>();
        this.animales = new ArrayList<>();
        this.plantas = new ArrayList<>();
    }

    public HabitatEntityDto(int id, TipoHabitat tipoHabitat,List<BebederoEntityDto> bebederos, List<ComederoEntityDto> comederos, List<AnimalEntityDto> animales, List<PlantaEntityDto> plantas) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.bebederos = bebederos;
        this.comederos = comederos;
        this.plantas = plantas;
        this.animales = animales;
    }

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

    public List<BebederoEntityDto> getBebederos() {
        return bebederos;
    }

    public void setBebederos(List<BebederoEntityDto> bebederos) {
        this.bebederos = bebederos;
    }

    public List<ComederoEntityDto> getComederos() {
        return comederos;
    }

    public void setComederos(List<ComederoEntityDto> comederos) {
        this.comederos = comederos;
    }

    public List<AnimalEntityDto> getAnimales() {
        return animales;
    }

    public void setAnimales(List<AnimalEntityDto> animales) {
        this.animales = animales;
    }

    public List<PlantaEntityDto> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<PlantaEntityDto> plantas) {
        this.plantas = plantas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitatEntityDto that = (HabitatEntityDto) o;
        return getId() == that.getId() && getTipoHabitat() == that.getTipoHabitat() && Objects.equals(getBebederos(), that.getBebederos()) && Objects.equals(getComederos(), that.getComederos()) && Objects.equals(getAnimales(), that.getAnimales()) && Objects.equals(getPlantas(), that.getPlantas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTipoHabitat(), getBebederos(), getComederos(), getAnimales(), getPlantas());
    }

    @Override
    public String toString() {
        return "HabitatEntityDto{" +
                "id=" + id +
                ", tipoHabitat=" + tipoHabitat +
                ", bebederos=" + bebederos +
                ", comederos=" + comederos +
                ", animales=" + animales +
                ", plantas=" + plantas +
                '}';
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
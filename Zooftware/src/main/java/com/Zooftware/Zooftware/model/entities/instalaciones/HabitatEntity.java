package com.Zooftware.Zooftware.model.entities.instalaciones;

import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.entities.organimos.AnimalEntity;
import com.Zooftware.Zooftware.model.entities.organimos.PlantaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "habitat")
@Inheritance(strategy = InheritanceType.JOINED)
public class HabitatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Enumerated(EnumType.STRING)
    private TipoHabitat tipoHabitat;

    @OneToMany(mappedBy = "habitat")
    private List<ComederoEntity> comederos;
    @OneToMany(mappedBy = "habitat")
    private List<BebederoEntity> bebederos;
    @OneToMany(mappedBy = "habitat")
    private List<AnimalEntity> animales;
    @OneToMany(mappedBy = "habitat")
    private List<PlantaEntity> plantas;

    public HabitatEntity(){}

    public HabitatEntity(TipoHabitat tipoHabitat, List<ComederoEntity> comederos, List<BebederoEntity> bebederos, List<AnimalEntity> animales, List<PlantaEntity> plantas) {
        this.tipoHabitat = tipoHabitat;
        this.comederos = comederos;
        this.bebederos = bebederos;
        this.animales = animales;
        this.plantas = plantas;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoHabitat getTipoHabitat() {
        return this.tipoHabitat;
    }

    public void setTipoHabitat(TipoHabitat tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public List<ComederoEntity> getComederos() {
        return this.comederos;
    }

    public void setComedero(List<ComederoEntity> comederos) {
        this.comederos = comederos;
    }

    public List<BebederoEntity> getBebederos() {
        return this.bebederos;
    }

    public void setBebedero(List<BebederoEntity> bebederos) {
        this.bebederos = bebederos;
    }

    public List<AnimalEntity> getAnimales() {
        return this.animales;
    }

    public void setAnimales(List<AnimalEntity> animales) {
        this.animales = animales;
    }

    public List<PlantaEntity> getPlantas() {
        return this.plantas;
    }

    public void setPlantas(List<PlantaEntity> plantas) {
        this.plantas = plantas;
    }
}

package com.Zooftware.Zooftware.modelJPA.instalaciones;

import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;
import com.Zooftware.Zooftware.modelJPA.organimos.PlantaEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "habitat", schema = "testbbdd", catalog = "")
public class HabitatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Enumerated(EnumType.STRING)
    private TipoHabitat tipoHabitat;

    @OneToMany
    @JoinColumn(name = "comedero_id")
    private List<ComederoEntity> comedero;
    @OneToMany
    @JoinColumn(name = "bebedero_id")
    private List<BebederoEntity> bebedero;
    @OneToMany
    @JoinColumn(name = "animal_id")
    private List<AnimalEntity> animales;
    @OneToMany
    @JoinColumn(name = "plantas_id")
    private List<PlantaEntity> plantas;

    public HabitatEntity(int id, TipoHabitat tipoHabitat, List<ComederoEntity> comedero, List<BebederoEntity> bebedero, List<AnimalEntity> animales, List<PlantaEntity> plantas) {
        this.id = id;
        this.tipoHabitat = tipoHabitat;
        this.comedero = comedero;
        this.bebedero = bebedero;
        this.animales = animales;
        this.plantas = plantas;
    }

    public HabitatEntity() {
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

    public List<ComederoEntity> getComedero() {
        return comedero;
    }

    public void setComedero(List<ComederoEntity> comedero) {
        this.comedero = comedero;
    }

    public List<BebederoEntity> getBebedero() {
        return bebedero;
    }

    public void setBebedero(List<BebederoEntity> bebedero) {
        this.bebedero = bebedero;
    }

    public List<AnimalEntity> getAnimales() {
        return animales;
    }

    public void setAnimales(List<AnimalEntity> animales) {
        this.animales = animales;
    }

    public List<PlantaEntity> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<PlantaEntity> plantas) {
        this.plantas = plantas;
    }
}

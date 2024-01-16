package com.Zooftware.Zooftware.modelJPA;

import jakarta.persistence.*;

@Entity
@Table(name = "organismo", schema = "testbbdd", catalog = "")
public class OrganismoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "edad")
    private int edad;
    @Basic
    @Column(name = "nombre_especie")
    private String nombreEspecie;
    @Basic
    @Column(name = "animal_id")
    private Integer animalId;
    @Basic
    @Column(name = "dimension_animal_id")
    private Integer dimensionAnimalId;
    @Basic
    @Column(name = "planta_id")
    private Integer plantaId;
    @Basic
    @Column(name = "organismo_id")
    private Integer organismoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public Integer getDimensionAnimalId() {
        return dimensionAnimalId;
    }

    public void setDimensionAnimalId(Integer dimensionAnimalId) {
        this.dimensionAnimalId = dimensionAnimalId;
    }

    public Integer getPlantaId() {
        return plantaId;
    }

    public void setPlantaId(Integer plantaId) {
        this.plantaId = plantaId;
    }

    public Integer getOrganismoId() {
        return organismoId;
    }

    public void setOrganismoId(Integer organismoId) {
        this.organismoId = organismoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganismoEntity that = (OrganismoEntity) o;

        if (id != that.id) return false;
        if (edad != that.edad) return false;
        if (nombreEspecie != null ? !nombreEspecie.equals(that.nombreEspecie) : that.nombreEspecie != null)
            return false;
        if (animalId != null ? !animalId.equals(that.animalId) : that.animalId != null) return false;
        if (dimensionAnimalId != null ? !dimensionAnimalId.equals(that.dimensionAnimalId) : that.dimensionAnimalId != null)
            return false;
        if (plantaId != null ? !plantaId.equals(that.plantaId) : that.plantaId != null) return false;
        if (organismoId != null ? !organismoId.equals(that.organismoId) : that.organismoId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + edad;
        result = 31 * result + (nombreEspecie != null ? nombreEspecie.hashCode() : 0);
        result = 31 * result + (animalId != null ? animalId.hashCode() : 0);
        result = 31 * result + (dimensionAnimalId != null ? dimensionAnimalId.hashCode() : 0);
        result = 31 * result + (plantaId != null ? plantaId.hashCode() : 0);
        result = 31 * result + (organismoId != null ? organismoId.hashCode() : 0);
        return result;
    }
}

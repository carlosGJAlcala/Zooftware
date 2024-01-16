package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import jakarta.persistence.*;

@Entity
@Table(name = "animal", schema = "testbbdd", catalog = "")
public class AnimalEntity {
    @Basic
    @Column(name = "hambre")
    private int hambre;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "num_extremidades")
    private int numExtremidades;
    @Basic
    @Column(name = "salud")
    private int salud;
    @Basic
    @Column(name = "sed")
    private int sed;
    @Basic
    @Column(name = "suenio")
    private int suenio;
    @Enumerated(EnumType.STRING)
    private EstadoAnimal estadoAnimal;
    @Basic
    @Column(name = "tipo")
    private TipoAnimal tipo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "comida_id")
    private Integer comidaId;

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSed() {
        return sed;
    }

    public void setSed(int sed) {
        this.sed = sed;
    }

    public int getSuenio() {
        return suenio;
    }

    public void setSuenio(int suenio) {
        this.suenio = suenio;
    }

    public EstadoAnimal getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(EstadoAnimal estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getComidaId() {
        return comidaId;
    }

    public void setComidaId(Integer comidaId) {
        this.comidaId = comidaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalEntity that = (AnimalEntity) o;

        if (hambre != that.hambre) return false;
        if (numExtremidades != that.numExtremidades) return false;
        if (salud != that.salud) return false;
        if (sed != that.sed) return false;
        if (suenio != that.suenio) return false;
        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (estadoAnimal != null ? !estadoAnimal.equals(that.estadoAnimal) : that.estadoAnimal != null) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;
        if (comidaId != null ? !comidaId.equals(that.comidaId) : that.comidaId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hambre;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + numExtremidades;
        result = 31 * result + salud;
        result = 31 * result + sed;
        result = 31 * result + suenio;
        result = 31 * result + (estadoAnimal != null ? estadoAnimal.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (comidaId != null ? comidaId.hashCode() : 0);
        return result;
    }
}

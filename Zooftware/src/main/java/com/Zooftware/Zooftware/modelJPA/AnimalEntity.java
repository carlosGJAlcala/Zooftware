package com.Zooftware.Zooftware.modelJPA;

import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;
import jakarta.persistence.*;

@Entity
@Table(name = "animal", schema = "testbbdd", catalog = "")
public class AnimalEntity {

    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "salud")
    private int salud;
    @Basic
    @Column(name = "suenio")
    private int suenio;
    @Enumerated(EnumType.STRING)
    private EstadoAnimal estadoAnimal;
    @Enumerated(EnumType.STRING)
    private TipoAnimal tipo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @OneToOne
    @JoinColumn(name = "comida_id")
    @Column(name = "comida", nullable = false)
    private int comida;

    @Enumerated(EnumType.STRING)

    private EstadoAnimal estadoActual;

    public EstadoAnimal getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoAnimal estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
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

    public TipoAnimal getTipo() {
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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnimalEntity that = (AnimalEntity) o;

        if (salud != that.salud) return false;
        if (suenio != that.suenio) return false;
        if (id != that.id) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (estadoAnimal != null ? !estadoAnimal.equals(that.estadoAnimal) : that.estadoAnimal != null) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + salud;
        result = 31 * result + suenio;
        result = 31 * result + (estadoAnimal != null ? estadoAnimal.hashCode() : 0);
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}

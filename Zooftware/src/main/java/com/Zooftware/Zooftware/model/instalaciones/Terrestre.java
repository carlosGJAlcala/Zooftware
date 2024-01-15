package com.Zooftware.Zooftware.model.instalaciones;

import com.Zooftware.Zooftware.model.instalaciones.interfaces.ISuelo;
import com.Zooftware.Zooftware.model.organismos.SueloImpl;
import jakarta.persistence.*;

@Entity
@Table(name = "terrestre")
public class Terrestre extends Habitat{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;

    private int NumBebederos;
    private int NumComederos;

    public Terrestre(){}
    public Terrestre(ISuelo tipoSuelo, int numBebederos, int numComederos) {
        super((SueloImpl) tipoSuelo);
        NumBebederos = numBebederos;
        NumComederos = numComederos;

    }

    public Terrestre(SueloImpl suelo, int id, String nombre, int numBebederos, int numComederos) {
        super(suelo);
        this.id = id;
        this.nombre = nombre;
        NumBebederos = numBebederos;
        NumComederos = numComederos;
    }

    public Terrestre(int id, String nombre, int numBebederos, int numComederos) {
        this.id = id;
        this.nombre = nombre;
        NumBebederos = numBebederos;
        NumComederos = numComederos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumBebederos() {
        return NumBebederos;
    }

    public void setNumBebederos(int numBebederos) {
        NumBebederos = numBebederos;
    }

    public int getNumComederos() {
        return NumComederos;
    }

    public void setNumComederos(int numComederos) {
        NumComederos = numComederos;
    }
}//end Terrestre
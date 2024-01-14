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

    public Terrestre(ISuelo tipoSuelo, int numBebederos, int numComederos) {
        super((SueloImpl) tipoSuelo);
        NumBebederos = numBebederos;
        NumComederos = numComederos;

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
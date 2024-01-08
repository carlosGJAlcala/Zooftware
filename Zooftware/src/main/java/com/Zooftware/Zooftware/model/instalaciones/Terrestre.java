package com.Zooftware.Zooftware.model.instalaciones;

import com.Zooftware.Zooftware.model.interfaces.ISuelo;

public class Terrestre extends HabitaAbs {

    private int NumBebederos;
    private int NumComederos;

    public Terrestre(ISuelo tipoSuelo, int numBebederos, int numComederos) {
        super(tipoSuelo);
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
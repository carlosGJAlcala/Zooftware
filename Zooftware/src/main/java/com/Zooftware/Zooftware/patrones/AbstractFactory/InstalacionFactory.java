package com.Zooftware.Zooftware.patrones.AbstractFactory;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;

public interface InstalacionFactory {

     AcuaticoEntityDto crerAcuarioAguaDulce();
     AcuaticoEntityDto crerAcuarioAguaSalada();

     AnfibioEntityDto crearHabitaAnfibio();

     TerrestreEntityDto crearHabitaTerrestre();

     void crearAlmacen();

     public void crearComederos(int numComederos, TipoComida tipo, HabitatEntityDto habitat);
     public void crearBebederos(int numBebederos, HabitatEntityDto habitat);

}

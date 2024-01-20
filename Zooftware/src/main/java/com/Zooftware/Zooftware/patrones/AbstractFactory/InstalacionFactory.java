package com.Zooftware.Zooftware.patrones.AbstractFactory;

import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;

import java.util.List;

public interface InstalacionFactory {

     AcuaticoEntityDto crerAcuarioAguaDulce();
     AcuaticoEntityDto crerAcuarioAguaSalada();

     AnfibioEntityDto crearHabitaAnfibio();

     TerrestreEntityDto crearHabitaTerrestre();

     AlmacenSingleton crearAlmacen();
     public List<ComederoEntityDto> crearComederos(int numComederos, TipoComida tipo);
     public List<BebederoEntityDto> crearBebederos(int numBebederos);

}

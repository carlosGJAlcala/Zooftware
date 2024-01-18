package com.Zooftware.Zooftware.patrones.AbstractFactory;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.AnfibioEntityDto;
import com.Zooftware.Zooftware.modelDTO.TerrestreEntityDto;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;

public interface InstalacionFactory {

     AcuaticoEntityDto crerAcuarioAguaDulce();
     AcuaticoEntityDto crerAcuarioAguaSalada();

     AnfibioEntityDto crearHabitaAnfibio();

     TerrestreEntityDto crearHabitaTerrestre();

     AlmacenSingleton crearAlmacen();

}

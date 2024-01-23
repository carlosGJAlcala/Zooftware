package com.Zooftware.Zooftware.model.services.patrones.AbstractFactory;

import com.Zooftware.Zooftware.model.dto.instalaciones.AcuaticoEntityDto;
import com.Zooftware.Zooftware.model.dto.instalaciones.AnfibioEntityDto;
import com.Zooftware.Zooftware.model.dto.instalaciones.HabitatEntityDto;
import com.Zooftware.Zooftware.model.dto.instalaciones.TerrestreEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;

public interface InstalacionFactory {

     AcuaticoEntityDto crerAcuarioAguaDulce();
     AcuaticoEntityDto crerAcuarioAguaSalada();

     AnfibioEntityDto crearHabitaAnfibio();

     TerrestreEntityDto crearHabitaTerrestre();

     void crearAlmacen();

     public void crearComederos(int numComederos, TipoComida tipo, HabitatEntityDto habitat);
     public void crearBebederos(int numBebederos, HabitatEntityDto habitat);

}

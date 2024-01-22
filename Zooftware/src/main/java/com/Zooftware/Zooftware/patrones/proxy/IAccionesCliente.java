package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public interface IAccionesCliente {

	public List<AnimalEntityDto> verAnimales();

	public List<HabitatEntityDto>  verInstalaciones();

	List<PlantaEntityDto> verPlantasPorHabita(int id_habita);
	public List<ComederoEntityDto> verComederos(int habita_id);

	AnimalEntityDto VerAnimal( int id_animal);
	List<AnimalEntityDto> verAnimalesPorHabita( int id_habita);



}
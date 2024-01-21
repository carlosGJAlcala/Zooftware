package com.Zooftware.Zooftware.patrones.proxy;


import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
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

	AnimalEntityDto VerAnimal( int id_animal);
	List<AnimalEntityDto> verAnimalesPorHabita( int id_habita);



}
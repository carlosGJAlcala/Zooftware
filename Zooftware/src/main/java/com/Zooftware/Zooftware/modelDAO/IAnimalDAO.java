package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

import java.util.List;

public interface IAnimalDAO {
    AnimalEntityDto buscarPorId(Integer id);
    List<AnimalEntityDto> buscarPorNombre(String nombre);
    List<AnimalEntityDto> buscarPorEstado (Object estadoAnimal);

    void guardarAnimal(AnimalEntityDto animal);
    void eliminarAnimal(AnimalEntityDto animal);
    void actualizarAnimal(AnimalEntityDto animal);

}

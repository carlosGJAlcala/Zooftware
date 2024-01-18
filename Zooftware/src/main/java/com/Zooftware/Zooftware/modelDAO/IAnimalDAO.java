package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;

import java.util.List;

public interface IAnimalDAO {
    AnimalEntityDto buscarPorId(Integer id);
    List<AnimalEntityDto> buscarPorNombre(String nombre);
    List<AnimalEntityDto> buscarPorEstado (String estadoAnimal);
    List<AnimalEntityDto> buscarPorTipo (String estadoAnimal);

    void guardarAnimal(AnimalEntityDto animal);
    void eliminarAnimalPorId(int id);
    void actualizarAnimal(AnimalEntityDto animal);

}

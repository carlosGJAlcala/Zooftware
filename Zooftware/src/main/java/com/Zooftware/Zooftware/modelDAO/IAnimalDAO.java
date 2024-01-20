package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;

import java.util.List;

public interface IAnimalDAO {
    AnimalEntityDto buscarPorId(Integer id);
    List<AnimalEntityDto> buscarPorNombre(String nombre);
    List<AnimalEntityDto> buscarPorEstado (EstadoAnimal estadoAnimal);
    List<AnimalEntityDto> buscarPorTipo (String estadoAnimal);

    void guardarAnimal(AnimalEntityDto animal);
    void eliminarAnimalPorId(int id);
    void actualizarAnimal(AnimalEntityDto animal);
    public List<AnimalEntityDto> verAnimales();

}

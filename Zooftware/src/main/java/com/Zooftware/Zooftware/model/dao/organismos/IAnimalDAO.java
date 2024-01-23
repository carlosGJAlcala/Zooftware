package com.Zooftware.Zooftware.model.dao.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;

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
    public List<AnimalEntityDto> verAnimalesPorHabita(int habita_id);


    void actualizarAnimalEstado(AnimalEntityDto animal);
}

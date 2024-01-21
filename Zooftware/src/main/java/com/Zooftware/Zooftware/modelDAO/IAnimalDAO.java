package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.organimos.AnimalEntity;

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

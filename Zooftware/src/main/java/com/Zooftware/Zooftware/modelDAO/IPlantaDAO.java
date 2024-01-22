package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;

import java.util.List;

public interface IPlantaDAO {
    public PlantaEntityDto buscarPorId(Integer id);

    List<PlantaEntityDto> verPlantasPorHabita(int idHabitat);

    void actualizarPlanta(PlantaEntityDto planta);
    void guardarPlanta(PlantaEntityDto planta);
    public void eliminarPlanta(Integer id);
}

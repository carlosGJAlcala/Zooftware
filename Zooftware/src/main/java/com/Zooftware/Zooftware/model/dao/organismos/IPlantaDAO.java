package com.Zooftware.Zooftware.model.dao.organismos;

import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;

import java.util.List;

public interface IPlantaDAO {
    public PlantaEntityDto buscarPorId(Integer id);

    List<PlantaEntityDto> verPlantasPorHabita(int idHabitat);

    void actualizarPlanta(PlantaEntityDto planta);
    void guardarPlanta(PlantaEntityDto planta);
    public void eliminarPlanta(Integer id);
}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.PlantaEntityDto;

public interface IPlantaDAO {
    public PlantaEntityDto buscarPorId(Integer id);
    void actualizarPlanta(PlantaEntityDto planta);
    void guardarPlanta(PlantaEntityDto planta);
    public void eliminarPlanta(Integer id);
}

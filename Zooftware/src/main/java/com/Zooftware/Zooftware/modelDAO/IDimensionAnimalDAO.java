package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelDTO.DimensionAnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.DimensionEntityDto;

public interface IDimensionAnimalDAO {
    public DimensionAnimalEntityDto buscarPorId(Integer id);
    void actualizarDimension(DimensionAnimalEntityDto dimension);
    void guardarDimension(DimensionAnimalEntityDto dimension);
    public void eliminarDimension(Integer id);
}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelDTO.DimensionEntityDto;

public interface IDimensionAnimalDAO {
    public DimensionEntityDto buscarPorId(Integer id);
    void actualizarDimension(DimensionEntityDto dimension);
    void guardarDimension(DimensionEntityDto dimension);
    public void eliminarDimension(Integer id);
}

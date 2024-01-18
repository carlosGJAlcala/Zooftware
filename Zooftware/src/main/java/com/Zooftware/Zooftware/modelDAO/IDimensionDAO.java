package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.DimensionEntityDto;

public interface IDimensionDAO {
    public DimensionEntityDto buscarPorId(Integer id);
    public int obtenerAreaPorId(int id);
    void actualizarDimension(DimensionEntityDto dimension);
    void guardarDimension(DimensionEntityDto dimension);
    public void eliminarDimension(Integer id);
}

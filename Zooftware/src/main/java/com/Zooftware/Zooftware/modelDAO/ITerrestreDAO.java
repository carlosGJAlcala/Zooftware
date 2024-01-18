package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TareaEntityDto;
import com.Zooftware.Zooftware.modelDTO.TerrestreEntityDto;

public interface ITerrestreDAO {
    public TerrestreEntityDto buscarPorId(Integer id);
    void actualizarTerrestre(TerrestreEntityDto terrestre);
    void guardarTerrestre(TerrestreEntityDto terrestre);
    public void eliminarTerrestre(Integer id);
}

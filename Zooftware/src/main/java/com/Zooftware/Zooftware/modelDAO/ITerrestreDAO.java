package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.TerrestreEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.TerrestreEntity;

public interface ITerrestreDAO {
    public TerrestreEntityDto buscarPorId(Integer id);
    void actualizarTerrestre(TerrestreEntityDto terrestre);
    TerrestreEntity guardarTerrestre(TerrestreEntityDto terrestre);
    public void eliminarTerrestre(Integer id);
}

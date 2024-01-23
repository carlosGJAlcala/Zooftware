package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.TerrestreEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.TerrestreEntity;

public interface ITerrestreDAO {
    public TerrestreEntityDto buscarPorId(Integer id);
    void actualizarTerrestre(TerrestreEntityDto terrestre);
    TerrestreEntity guardarTerrestre(TerrestreEntityDto terrestre);
    public void eliminarTerrestre(Integer id);
}

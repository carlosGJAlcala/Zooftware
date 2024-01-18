package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelDTO.SueloImplEntityDto;

public interface ISueloDAO {
    public SueloImplEntityDto buscarPorId(Integer id);
    void actualizarSuelo(SueloImplEntityDto suelo);
    void guardarSuelo(SueloImplEntityDto suelo);
    public void eliminarSuelo(Integer id);
}

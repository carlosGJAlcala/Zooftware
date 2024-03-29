package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.HabitatEntityDto;

import java.util.List;

public interface IHabitatDAO {
    public HabitatEntityDto buscarPorId(Integer id);
    void actualizarHabitat(HabitatEntityDto habitat);
    void guardarHabitat(HabitatEntityDto habitat);

    List<HabitatEntityDto> buscarTodos();

    public void eliminarHabitat(Integer id);
}

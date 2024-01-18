package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelDTO.OrganismoEntityDto;

public interface IHabitatDAO {
    public HabitatEntityDto buscarPorId(Integer id);
    void actualizarHabitat(HabitatEntityDto habitat);
    void guardarHabitat(HabitatEntityDto habitat);
    public void eliminarHabitat(Integer id);
}

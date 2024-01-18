package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;
import com.Zooftware.Zooftware.modelDTO.OrganismoEntityDto;

public interface IOrganismoDAO {
    public OrganismoEntityDto buscarPorId(Integer id);
    void actualizarOrganismo(OrganismoEntityDto organismo);
    void guardarOrganismo(OrganismoEntityDto organismo);
    public void eliminarOrganismo(Integer id);
}

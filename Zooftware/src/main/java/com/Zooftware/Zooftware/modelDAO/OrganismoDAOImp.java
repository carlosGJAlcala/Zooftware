package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.OrganismoEntityDto;
import com.Zooftware.Zooftware.modelJPA.ClienteEntity;
import com.Zooftware.Zooftware.modelJPA.OrganismoEntity;
import com.Zooftware.Zooftware.repository.MensajeEntityRepository;
import com.Zooftware.Zooftware.repository.OrganismoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class OrganismoDAOImp implements IOrganismoDAO{
    @Autowired
    OrganismoEntityRepository organismoJPA;
    OrganismoEntityMapper organismoEntityMapper;
    @Override
    public OrganismoEntityDto buscarPorId(Integer id) {
        Optional<OrganismoEntity> optional = organismoJPA.findById(id);
        if (optional.isPresent()) {
            return organismoEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarOrganismo(OrganismoEntityDto organismo) {
        organismoJPA.deleteById(organismo.getId());
        OrganismoEntity organismoEntity=organismoEntityMapper.mapper.toEntity(organismo);
        organismoJPA.save(organismoEntity);
    }

    @Override
    public void guardarOrganismo(OrganismoEntityDto organismo) {
        OrganismoEntity organismoEntity=organismoEntityMapper.mapper.toEntity(organismo);
        organismoJPA.save(organismoEntity);
    }

    @Override
    public void eliminarOrganismo(Integer id) {
        organismoJPA.deleteById(id);
    }
}

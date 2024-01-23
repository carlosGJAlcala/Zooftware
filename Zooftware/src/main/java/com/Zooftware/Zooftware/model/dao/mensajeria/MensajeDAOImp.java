package com.Zooftware.Zooftware.model.dao.mensajeria;

import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;
import com.Zooftware.Zooftware.model.entities.mensajeria.MensajeEntity;
import com.Zooftware.Zooftware.model.repository.MensajeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class MensajeDAOImp implements IMensajeDAO {
    @Autowired
    MensajeEntityRepository mensajeJPA;
    MensajeEntityMapper mensajeEntityMapper;
    @Override
    public MensajeEntityDto buscarPorId(Integer id) {
        Optional<MensajeEntity> optional = mensajeJPA.findById(id);
        if (optional.isPresent()) {
            return mensajeEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarMensaje(MensajeEntityDto mensaje) {
        mensajeJPA.deleteById(mensaje.getId());
        MensajeEntity mensajeEntity=mensajeEntityMapper.mapper.toEntity(mensaje);
        mensajeJPA.save(mensajeEntity);
    }

    @Override
    public void guardarMensaje(MensajeEntityDto mensaje) {
        MensajeEntity mensajeEntity=mensajeEntityMapper.mapper.toEntity(mensaje);
        mensajeJPA.save(mensajeEntity);
    }

    @Override
    public void eliminarMensaje(Integer id) {
        mensajeJPA.deleteById(id);
    }
}

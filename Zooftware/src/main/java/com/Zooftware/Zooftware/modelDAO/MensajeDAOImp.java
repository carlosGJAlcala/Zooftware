package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;
import com.Zooftware.Zooftware.modelJPA.mensajeria.MensajeEntity;
import com.Zooftware.Zooftware.repository.MensajeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MensajeDAOImp implements IMensajeDAO{
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

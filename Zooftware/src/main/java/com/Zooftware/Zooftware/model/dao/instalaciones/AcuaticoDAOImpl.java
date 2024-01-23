package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AcuaticoEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AcuaticoEntity;
import com.Zooftware.Zooftware.model.entities.enums.TipoAgua;
import com.Zooftware.Zooftware.model.repository.AcuaticoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AcuaticoDAOImpl implements IAcuaticoDAO {
    @Autowired
    AcuaticoEntityRepository acuariojpa;
    AcuaticoEntityMapper acuaticoEntityMapper;

    @Override
    public AcuaticoEntityDto buscarPorId(Integer id) {
        Optional<AcuaticoEntity> optional = acuariojpa.findById(id);
        if (optional.isPresent()) {
            AcuaticoEntityDto acuarioDTO= acuaticoEntityMapper.mapper.toDto((optional.get()));
            return acuarioDTO;
        }
        return null;
    }

    @Override
    public List<AcuaticoEntityDto> buscarPorTipoAgua(TipoAgua tipoAgua) {
        List<AcuaticoEntity> lista = acuariojpa.findByTipoAgua(tipoAgua);

        return lista.stream().map(acuaticoEntityMapper.mapper::toDto).collect(Collectors.toList());
    }


    @Override
    public void actualizar(AcuaticoEntityDto acuario) {
        acuariojpa.deleteById(acuario.getId());
        AcuaticoEntity acuaticoEntity=acuaticoEntityMapper.mapper.toEntity(acuario);
        acuariojpa.save(acuaticoEntity);

    }

    @Override
    public AcuaticoEntity guardarAcuario(AcuaticoEntityDto acuario) {
        AcuaticoEntity acuaticoEntity=acuaticoEntityMapper.mapper.toEntity(acuario);
        return acuariojpa.save(acuaticoEntity);

    }

    @Override
    public void eliminarAcuario(Integer id) {
        acuariojpa.deleteById(id);
    }
}

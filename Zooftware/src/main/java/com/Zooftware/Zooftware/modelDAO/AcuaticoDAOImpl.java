package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.repository.AcuaticoEntityRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AcuaticoDAOImpl implements IAcuaticoDAO {
    @Autowired
    AcuaticoEntityRepository acuariojpa;
//    @Autowired
//    AcuaticoEntityMapper mapper;
//
//    @Autowired

    @Override
    public AcuaticoEntityDto buscarPorId(Integer id) {
        Optional<AcuaticoEntity> optional = acuariojpa.findById(id);
        if (optional.isPresent()) {
            AcuaticoEntityDto acuarioDTO= AcuaticoEntityMapper.INSTANCE.toDto((optional.get()));
            return acuarioDTO;
        }
        return null;
    }

    @Override
    public List<AcuaticoEntityDto> buscarPorTipoAgua(TipoAgua tipoAgua) {
        List<AcuaticoEntity> lista = acuariojpa.findByTipoAgua(tipoAgua);

        return lista.stream().map(AcuaticoEntityMapper.INSTANCE::toDto).collect(Collectors.toList());
    }


    @Override
    public void actualizar(AcuaticoEntityDto acuario) {
        acuariojpa.deleteById(acuario.getId());
        AcuaticoEntity acuaticoEntity=AcuaticoEntityMapper.INSTANCE.toEntity(acuario);
        acuariojpa.save(acuaticoEntity);

    }

    @Override
    public void guardarAcuario(AcuaticoEntityDto acuario) {
        AcuaticoEntity acuaticoEntity=AcuaticoEntityMapper.INSTANCE.toEntity(acuario);
        acuariojpa.save(acuaticoEntity);

    }

    @Override
    public void eliminarAcuario(Integer id) {
        acuariojpa.deleteById(id);
    }
}

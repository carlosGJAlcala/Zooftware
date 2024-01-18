package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.comida.ComidaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.repository.ComidaEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Repository
public class ComidaDAOImp implements IComidaDAO{
    @Autowired
    ComidaEntityRepository comidaEntityJPA;
    ComidaEntityMapper comidaEntityMapper;

    @Override
    public List<ComidaEntityDto> buscarPorTipoComida(TipoComida tipoComida) {
        List<ComidaEntity> lista = comidaEntityJPA.findByTipoComida(tipoComida);

        return lista.stream().map(comidaEntityMapper.mapper::toDto).collect(Collectors.toList());

    }

    @Override
    public int obtenerCantidadComida(int id) {
        return buscarPorId(id).getCantidad();
    }

    @Override
    public ComidaEntityDto buscarPorNombre(String nombre) {
        Optional<ComidaEntity> optional = comidaEntityJPA.findByNombre(nombre);
        if (optional.isPresent()) {
            return comidaEntityMapper.mapper.toDto((optional.get()));
        }
        return null;
    }

    @Override
    public ComidaEntityDto buscarPorId(Integer id) {
        Optional<ComidaEntity> optional = comidaEntityJPA.findById(id);
        if (optional.isPresent()) {
            return comidaEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarComida(ComidaEntityDto comida) {
        comidaEntityJPA.deleteById(comida.getId());
        ComidaEntity comidaEntity=comidaEntityMapper.mapper.toEntity(comida);
        comidaEntityJPA.save(comidaEntity);
    }

    @Override
    public void guardarComida(ComidaEntityDto comida) {
        ComidaEntity comidaEntity=comidaEntityMapper.mapper.toEntity(comida);
        comidaEntityJPA.save(comidaEntity);
    }

    @Override
    public void eliminarComida(Integer id) {
        comidaEntityJPA.deleteById(id);
    }
}

package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.comida.ComidaEntity;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;
import com.Zooftware.Zooftware.model.repository.ComidaEntityRepository;
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
    public ComidaEntityDto actualizarComida(ComidaEntityDto comida) {
        Optional<ComidaEntity> optional = comidaEntityJPA.findByComederoEntity_Id(comida.getComederoEntity().getId());
        if (optional.isPresent()) {
            comidaEntityJPA.deleteById(optional.get().getId());
        }
        ComidaEntity comidaEntity=comidaEntityMapper.mapper.toEntity(comida);
        comidaEntity=comidaEntityJPA.save(comidaEntity);
        return  comidaEntityMapper.mapper.toDto(comidaEntity);


    }

    @Override
    public ComidaEntityDto guardarComida(ComidaEntityDto comida) {
        ComidaEntity comidaEntity=comidaEntityMapper.mapper.toEntity(comida);
        try {
            ComidaEntity comidaEntity1 =comidaEntityJPA.save(comidaEntity);
            return comidaEntityMapper.mapper.toDto(comidaEntity1);
        }catch (Exception e){
            System.err.println(e.getMessage().toString());
            return comida;

        }




    }

    @Override
    public void eliminarComida(Integer id) {
        comidaEntityJPA.deleteById(id);
    }
}

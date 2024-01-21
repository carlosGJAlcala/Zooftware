package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;
import com.Zooftware.Zooftware.repository.BebederoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BebederoDAOImp implements IBebederoDAO {
    @Autowired
    BebederoEntityRepository bebederoJPA;
    BebederoEntityMapper bebederoEntityMapper;

    @Override
    public BebederoEntityDto buscarPorId(Integer id) {
        Optional<BebederoEntity> optional = bebederoJPA.findById(id);
        if (optional.isPresent()) {
            return bebederoEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarBebedero(BebederoEntityDto bebedero) {
        bebederoJPA.deleteById(bebedero.getId());
        BebederoEntity bebederoEntity = bebederoEntityMapper.mapper.toEntity(bebedero);
        bebederoJPA.save(bebederoEntity);
    }

    @Override
    public void guardarBebedero(BebederoEntityDto bebedero) {
        BebederoEntity bebederoEntity = bebederoEntityMapper.mapper.toEntity(bebedero);
        bebederoJPA.save(bebederoEntity);
    }

    @Override
    public void eliminarBebedero(Integer id) {
        bebederoJPA.deleteById(id);
    }

    @Override
    public List<BebederoEntity> verBebederos(int habita_id) {

        List<BebederoEntity> resultados = bebederoJPA.findByHabitat_Id(habita_id);
        StringBuilder stringBuilder = new StringBuilder();
        for (BebederoEntity animal : resultados) {
            stringBuilder.append(animal.toString()).append("\n");
        }
        System.out.println(stringBuilder.toString());


        return resultados;
    }
}

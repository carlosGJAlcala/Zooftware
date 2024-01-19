package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.persona.JefeEntity;
import com.Zooftware.Zooftware.repository.JefeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class JefeDAOImp implements IJefeDAO{

    @Autowired
    JefeEntityRepository jefeJPA;
    JefeEntityMapper jefeEntityMapper;

    @Override
    public JefeEntityDto buscarPorId(Integer id) {
        Optional<JefeEntity> optional = jefeJPA.findById(id);
        if (optional.isPresent()) {
            return jefeEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void prueba(){

//
//        Optional<JefeEntity> jefe =  jefeJPA.findById(1);
//        if (jefe.isPresent()) {
//            JefeEntityDto j=  jefeEntityMapper.mapper.toDto(jefe.get());
//
//            String pass= j.getPassword();
//
//            String passs2 = pass;
//
//            JefeEntityDto jefePr = new JefeEntityDto(10,"test","3243",34,"sdfds","pass", Rol.EMPLEADO,"test",null,null,null);
//            JefeEntity jefeE =  jefeEntityMapper.mapper.toEntity(jefePr);
//            jefeJPA.save(jefeE);
//
//        }
//


    }

    @Override
    public JefeEntityDto getJefeByUsername(String username) {
        JefeEntity jefeEntity = jefeJPA.findByUsername(username);
        return jefeEntityMapper.mapper.toDto(jefeEntity);
    }

    @Override
    public void actualizarJefe(JefeEntityDto jefe) {
        jefeJPA.deleteById(jefe.getId());
        JefeEntity jefeEntity=jefeEntityMapper.mapper.toEntity(jefe);
        jefeJPA.save(jefeEntity);
    }

    @Override
    public void guardarJefe(JefeEntityDto jefe) {
        JefeEntity jefeEntity=jefeEntityMapper.mapper.toEntity(jefe);
        jefeJPA.save(jefeEntity);
    }

    @Override
    public void eliminarJefe(Integer id) {
        jefeJPA.deleteById(id);
    }
}

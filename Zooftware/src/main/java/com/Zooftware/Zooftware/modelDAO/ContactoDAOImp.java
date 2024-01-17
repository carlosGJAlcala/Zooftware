package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelJPA.ContactoEntity;
import com.Zooftware.Zooftware.modelJPA.JefeEntity;
import com.Zooftware.Zooftware.repository.ContactoEntityRepository;
import com.Zooftware.Zooftware.repository.JefeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ContactoDAOImp implements IContactoDAO{
    @Autowired
    ContactoEntityRepository contactoJPA;
    ContactoEntityMapper contactoEntityMapper;

    @Override
    public ContactoEntityDto buscarPorId(Integer id) {
        Optional<ContactoEntity> optional = contactoJPA.findById(id);
        if (optional.isPresent()) {
            return contactoEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarContacto(ContactoEntityDto contacto) {
        contactoJPA.deleteById(contacto.getId());
        ContactoEntity contactoEntity=contactoEntityMapper.mapper.toEntity(contacto);
        contactoJPA.save(contactoEntity);
    }

    @Override
    public void guardarContacto(ContactoEntityDto contacto) {
        ContactoEntity contactoEntity=contactoEntityMapper.mapper.toEntity(contacto);
        contactoJPA.save(contactoEntity);
    }

    @Override
    public void eliminarContacto(Integer id) {
        contactoJPA.deleteById(id);
    }
}

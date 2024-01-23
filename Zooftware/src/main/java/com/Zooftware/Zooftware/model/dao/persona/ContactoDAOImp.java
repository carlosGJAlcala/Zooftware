package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.ContactoEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.ContactoEntity;
import com.Zooftware.Zooftware.model.repository.ContactoEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
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
    public ContactoEntity guardarContacto(ContactoEntityDto contacto) {
        ContactoEntity contactoEntity=contactoEntityMapper.mapper.toEntity(contacto);
        return contactoJPA.save(contactoEntity);
    }

    @Override
    public void eliminarContacto(Integer id) {
        contactoJPA.deleteById(id);
    }
}

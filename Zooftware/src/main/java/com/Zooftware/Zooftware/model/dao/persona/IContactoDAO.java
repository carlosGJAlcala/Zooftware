package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.ContactoEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.ContactoEntity;

public interface IContactoDAO {
    public ContactoEntityDto buscarPorId(Integer id);
    void actualizarContacto(ContactoEntityDto contacto);
    ContactoEntity guardarContacto(ContactoEntityDto contacto);
    public void eliminarContacto(Integer id);
}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelJPA.persona.ContactoEntity;

public interface IContactoDAO {
    public ContactoEntityDto buscarPorId(Integer id);
    void actualizarContacto(ContactoEntityDto contacto);
    ContactoEntity guardarContacto(ContactoEntityDto contacto);
    public void eliminarContacto(Integer id);
}

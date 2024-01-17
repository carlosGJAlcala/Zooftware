package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;

public interface IContactoDAO {
    public ContactoEntityDto buscarPorId(Integer id);
    void actualizarContacto(ContactoEntityDto contacto);
    void guardarContacto(ContactoEntityDto contacto);
    public void eliminarContacto(Integer id);
}

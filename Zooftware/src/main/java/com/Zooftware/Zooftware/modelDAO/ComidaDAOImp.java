package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;

import java.util.List;

public class ComidaDAOImp implements IComidaDAO{
    @Override
    public List<ComidaEntityDto> buscarPorTipoComida(String tipoComida) {
        return null;
    }

    @Override
    public int obtenerCantidadComida(int id) {
        return 0;
    }

    @Override
    public ComidaEntityDto buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public ContactoEntityDto buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void actualizarContacto(ContactoEntityDto contacto) {

    }

    @Override
    public void guardarContacto(ContactoEntityDto contacto) {

    }

    @Override
    public void eliminarContacto(Integer id) {

    }
}

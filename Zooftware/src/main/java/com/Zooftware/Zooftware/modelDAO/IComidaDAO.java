package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;

import java.util.List;

public interface IComidaDAO {
    public List<ComidaEntityDto> buscarPorTipoComida(String tipoComida);
    public int obtenerCantidadComida(int id);
    public ComidaEntityDto buscarPorNombre(String nombre);

    public ContactoEntityDto buscarPorId(Integer id);
    void actualizarContacto(ContactoEntityDto contacto);
    void guardarContacto(ContactoEntityDto contacto);
    public void eliminarContacto(Integer id);

}

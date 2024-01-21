package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ContactoEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;

import java.util.List;

public interface IComidaDAO {
    public List<ComidaEntityDto> buscarPorTipoComida(TipoComida tipoComida);
    public int obtenerCantidadComida(int id);
    public ComidaEntityDto buscarPorNombre(String nombre);
    public ComidaEntityDto buscarPorId(Integer id);
    void actualizarComida(ComidaEntityDto comida);
    ComidaEntityDto guardarComida(ComidaEntityDto comida);
    public void eliminarComida(Integer id);

}

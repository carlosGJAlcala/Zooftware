package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;

import java.util.List;

public interface IComidaDAO {
    public List<ComidaEntityDto> buscarPorTipoComida(TipoComida tipoComida);
    public int obtenerCantidadComida(int id);
    public ComidaEntityDto buscarPorNombre(String nombre);
    public ComidaEntityDto buscarPorId(Integer id);
    ComidaEntityDto actualizarComida(ComidaEntityDto comida);
    ComidaEntityDto guardarComida(ComidaEntityDto comida);
    public void eliminarComida(Integer id);

}

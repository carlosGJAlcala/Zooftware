package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaOmnivoraEntityDto;

import java.util.List;

public interface IComidaOmnivoraDAO {
  public ComidaOmnivoraEntityDto buscarPorId(Integer id);
    void actualizarComida(ComidaOmnivoraEntityDto comida);
    void guardarComida(ComidaOmnivoraEntityDto comida);
    public void eliminarComida(Integer id);
}

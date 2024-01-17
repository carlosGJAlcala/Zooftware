package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaCarnivoraEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;

import java.util.List;

public interface IComidaCarnivoraDAO {
    public ComidaCarnivoraEntityDto buscarPorId(Integer id);
    void actualizarComidaCarnivora(ComidaCarnivoraEntityDto comida);
    void guardarComidaCarnivora(ComidaCarnivoraEntityDto comida);
    public void eliminarComidaCarnivora(Integer id);
}

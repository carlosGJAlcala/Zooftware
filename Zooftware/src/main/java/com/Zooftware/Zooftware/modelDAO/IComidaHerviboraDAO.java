package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComidaHerviboraEntityDto;

import java.util.List;

public interface IComidaHerviboraDAO {
    public ComidaHerviboraEntityDto buscarPorId(Integer id);
    void actualizarComidaHervibora(ComidaHerviboraEntityDto comida);
    void guardarComidaHervibora(ComidaHerviboraEntityDto comida);
    public void eliminarComidaHervibora(Integer id);
}

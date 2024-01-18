package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;

public interface IComederoDAO {
    public ComederoEntityDto buscarPorId(Integer id);
    void actualizarComedero(ComederoEntityDto comedero);
    void guardarComedero(ComederoEntityDto comedero);
    public void eliminarComedero(Integer id);
}

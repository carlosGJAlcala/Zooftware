package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;

import java.util.List;

public interface IComederoDAO {
    public ComederoEntityDto buscarPorId(Integer id);
    void actualizarComedero(ComederoEntityDto comedero);
    void guardarComedero(ComederoEntityDto comedero);
    public void eliminarComedero(Integer id);

    List<ComederoEntityDto> verComederos(int habita_id);
}

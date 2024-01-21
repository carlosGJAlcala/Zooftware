package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.ComederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;

import java.util.List;

public interface IComederoDAO {
    public ComederoEntityDto buscarPorId(Integer id);
    void actualizarComedero(ComederoEntityDto comedero);
    void guardarComedero(ComederoEntityDto comedero);
    public void eliminarComedero(Integer id);

    List<ComederoEntity> verComederos(int habita_id);
}

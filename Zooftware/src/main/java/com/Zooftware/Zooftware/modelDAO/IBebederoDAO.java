package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.BebederoEntity;

import java.util.List;

public interface IBebederoDAO {
    public BebederoEntityDto buscarPorId(Integer id);
    public void actualizarBebedero(BebederoEntityDto bebedero);
    public void guardarBebedero(BebederoEntityDto bebedero);
    public void eliminarBebedero(Integer id);
    List<BebederoEntity> verBebederos(int habitaId);
}

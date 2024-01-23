package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;

import java.util.List;

public interface IBebederoDAO {
    public BebederoEntityDto buscarPorId(Integer id);
    public void actualizarBebedero(BebederoEntityDto bebedero);
    public void guardarBebedero(BebederoEntityDto bebedero);
    public void eliminarBebedero(Integer id);
    List<BebederoEntityDto> verBebederos(int habitaId);
}

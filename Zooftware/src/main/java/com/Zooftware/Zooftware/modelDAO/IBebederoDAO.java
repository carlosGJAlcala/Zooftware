package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;

public interface IBebederoDAO {
    public BebederoEntityDto buscarPorId(Integer id);
    void actualizarBebedero(BebederoEntityDto bebedero);
    void guardarBebedero(BebederoEntityDto bebedero);
    public void eliminarBebedero(Integer id);
}

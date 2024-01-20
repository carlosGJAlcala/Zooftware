package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.BebederoEntityDto;
import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;

public interface IBebederoDAO {
    public BebederoEntityDto buscarPorId(Integer id);
    public void actualizarBebedero(BebederoEntityDto bebedero);
    public void guardarBebedero(BebederoEntityDto bebedero);
    public void eliminarBebedero(Integer id);
}

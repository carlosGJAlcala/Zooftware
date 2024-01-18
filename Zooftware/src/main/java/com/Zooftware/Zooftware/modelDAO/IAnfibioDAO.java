package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.AnfibioEntityDto;

public interface IAnfibioDAO {
    AnfibioEntityDto encontrarPorId(Integer id);
    void actualizar(AnfibioEntityDto acuario);
    void guardar(AnfibioEntityDto acuario);
    void eliminar(Integer id);


}

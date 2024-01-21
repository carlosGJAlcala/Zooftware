package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AnfibioEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AnfibioEntity;

public interface IAnfibioDAO {
    AnfibioEntityDto encontrarPorId(Integer id);
    void actualizar(AnfibioEntityDto acuario);
    AnfibioEntity guardar(AnfibioEntityDto acuario);
    void eliminar(Integer id);


}

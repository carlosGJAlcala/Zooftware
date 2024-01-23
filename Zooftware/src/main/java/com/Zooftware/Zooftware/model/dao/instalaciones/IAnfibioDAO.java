package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AnfibioEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AnfibioEntity;

public interface IAnfibioDAO {
    AnfibioEntityDto encontrarPorId(Integer id);
    void actualizar(AnfibioEntityDto acuario);
    AnfibioEntity guardar(AnfibioEntityDto acuario);
    void eliminar(Integer id);


}

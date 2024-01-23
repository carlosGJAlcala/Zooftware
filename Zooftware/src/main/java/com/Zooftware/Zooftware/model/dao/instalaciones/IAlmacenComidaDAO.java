package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.model.entities.instalaciones.AlmacenComidaEntity;

import java.util.List;

public interface IAlmacenComidaDAO {
    AlmacenComidaEntityDto encontrarPorId(Integer id);

    List<AlmacenComidaEntityDto> buscarAlmacenes();
    void actualizar(AlmacenComidaEntityDto acuario);
    AlmacenComidaEntity guardar(AlmacenComidaEntityDto acuario);

    void eliminar(int id);
}

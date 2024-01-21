package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AlmacenComidaEntity;

import java.util.List;

public interface IAlmacenComidaDAO {
    AlmacenComidaEntityDto encontrarPorId(Integer id);

    List<AlmacenComidaEntityDto> buscarAlmacenes();
    void actualizar(AlmacenComidaEntityDto acuario);
    AlmacenComidaEntity guardar(AlmacenComidaEntityDto acuario);

    void eliminar(int id);
}

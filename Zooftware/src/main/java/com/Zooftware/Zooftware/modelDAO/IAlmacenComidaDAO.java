package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;

import java.util.List;

public interface IAlmacenComidaDAO {
    AlmacenComidaEntityDto encontrarPorId(Integer id);

    List<AlmacenComidaEntityDto> buscarAlmacenes();
    void actualizar(AlmacenComidaEntityDto acuario);
    void guardar(AlmacenComidaEntityDto acuario);
    public void eliminar(AlmacenComidaEntityDto id);
}

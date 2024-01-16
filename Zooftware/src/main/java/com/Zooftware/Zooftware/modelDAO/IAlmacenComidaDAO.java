package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity;

public interface IAlmacenComidaDAO {
    AlmacenComidaEntityDto encontrarPorId(Integer id);
}

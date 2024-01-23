package com.Zooftware.Zooftware.model.dao.instalaciones;

import com.Zooftware.Zooftware.model.dto.instalaciones.AcuaticoEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.TipoAgua;
import com.Zooftware.Zooftware.model.entities.instalaciones.AcuaticoEntity;

import java.util.List;

public interface IAcuaticoDAO {
    public AcuaticoEntityDto buscarPorId(Integer id);
    public List<AcuaticoEntityDto> buscarPorTipoAgua(TipoAgua tipoAgua);
    void actualizar(AcuaticoEntityDto acuario);
    AcuaticoEntity guardarAcuario(AcuaticoEntityDto acuario);
    public void eliminarAcuario(Integer id);


}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelJPA.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;

import java.util.List;

public interface IAcuaticoDAO {
    public AcuaticoEntityDto buscarPorId(Integer id);
    public List<AcuaticoEntityDto> buscarPorTipoAgua(TipoAgua tipoAgua);
    void actualizar(AcuaticoEntityDto acuario);
    void guardarAcuario(AcuaticoEntityDto acuario);
    public void eliminarAcuario(Integer id);


}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;

import java.util.List;

public interface ITrabajadorDAO {
    public TrabajadorEntityDto buscarPorId(Integer id);
    public List<TrabajadorEntityDto> buscarActivos();
    void actualizarTrabajador(TrabajadorEntityDto acuario);
    void guardarTrabajador(TrabajadorEntityDto acuario);
    public void eliminarTrabajador(Integer id);


}

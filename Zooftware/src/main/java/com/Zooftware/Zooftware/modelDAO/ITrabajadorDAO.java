package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.TrabajadorEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.modelJPA.persona.TrabajadorEntity;

import java.util.List;

public interface ITrabajadorDAO {
    public TrabajadorEntity buscarPorId(Integer id);
    public List<TrabajadorEntityDto> buscarActivos();
    void actualizarTrabajador(TrabajadorEntityDto acuario);
    void guardarTrabajador(TrabajadorEntityDto acuario);
    public void eliminarTrabajador(Integer id);

    public List<TrabajadorEntity> buscarPorJefe(int id_jefe);


}

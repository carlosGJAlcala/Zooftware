package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.TrabajadorEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.TrabajadorEntity;

import java.util.List;

public interface ITrabajadorDAO {
    public TrabajadorEntity buscarPorId(Integer id);
    public List<TrabajadorEntityDto> buscarActivos();
    void actualizarTrabajador(TrabajadorEntityDto acuario);
    void guardarTrabajador(TrabajadorEntityDto acuario);
    public void eliminarTrabajador(Integer id);

    public List<TrabajadorEntity> buscarPorJefe(int id_jefe);


}

package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.SueloImplEntityDto;
import com.Zooftware.Zooftware.modelDTO.TareaEntityDto;

public interface ITareaDAO {
    public TareaEntityDto buscarPorId(Integer id);
    void actualizarTarea(TareaEntityDto tarea);
    void guardarTarea(TareaEntityDto tarea);
    public void eliminarTarea(Integer id);
}

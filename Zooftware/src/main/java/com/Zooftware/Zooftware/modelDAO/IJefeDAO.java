package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.EmpleadoEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;

public interface IJefeDAO {
    public JefeEntityDto buscarPorId(Integer id);

    void prueba();

    public JefeEntityDto getJefeByUsername(String username);

    JefeEntityDto getJefeById(int id);

    void actualizarJefe(JefeEntityDto jefe);
    void guardarJefe(JefeEntityDto jefe);
    public void eliminarJefe(Integer id);
}

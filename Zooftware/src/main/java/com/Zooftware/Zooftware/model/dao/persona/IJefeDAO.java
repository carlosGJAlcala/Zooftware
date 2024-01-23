package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dto.persona.JefeEntityDto;

public interface IJefeDAO {
    public JefeEntityDto buscarPorId(Integer id);

    void prueba();

    public JefeEntityDto getJefeByUsername(String username);

    JefeEntityDto getJefeById(int id);

    void actualizarJefe(JefeEntityDto jefe);
    void guardarJefe(JefeEntityDto jefe);
    public void eliminarJefe(Integer id);
}

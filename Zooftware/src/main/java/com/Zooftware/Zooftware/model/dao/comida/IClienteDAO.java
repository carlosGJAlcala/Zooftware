package com.Zooftware.Zooftware.model.dao.comida;

import com.Zooftware.Zooftware.model.dto.persona.ClienteEntityDto;

public interface IClienteDAO {
    public ClienteEntityDto buscarPorId(Integer id);
    void actualizarCliente(ClienteEntityDto cliente);
    void guardarCliente(ClienteEntityDto cliente);
    public void eliminarCliente(Integer id);

    public ClienteEntityDto getClienteByUsername(String username);

}

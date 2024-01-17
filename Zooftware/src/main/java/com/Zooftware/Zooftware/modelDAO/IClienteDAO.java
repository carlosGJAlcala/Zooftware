package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.ClienteEntityDto;
import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;

public interface IClienteDAO {
    public ClienteEntityDto buscarPorId(Integer id);
    void actualizarCliente(ClienteEntityDto cliente);
    void guardarCliente(ClienteEntityDto cliente);
    public void eliminarCliente(Integer id);
}

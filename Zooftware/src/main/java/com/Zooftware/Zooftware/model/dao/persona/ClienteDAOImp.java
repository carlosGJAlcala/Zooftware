package com.Zooftware.Zooftware.model.dao.persona;

import com.Zooftware.Zooftware.model.dao.comida.IClienteDAO;
import com.Zooftware.Zooftware.model.dto.persona.ClienteEntityDto;
import com.Zooftware.Zooftware.model.entities.persona.ClienteEntity;
import com.Zooftware.Zooftware.model.repository.ClienteEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class ClienteDAOImp implements IClienteDAO {

    @Autowired
    ClienteEntityRepository clienteJPA;
    ClienteEntityMapper clienteEntityMapper;



    @Override
    public ClienteEntityDto buscarPorId(Integer id) {
        Optional<ClienteEntity> optional = clienteJPA.findById(id);
        if (optional.isPresent()) {
            return clienteEntityMapper.mapper.toDto(optional.get());
        }
        return null;
    }

    @Override
    public void actualizarCliente(ClienteEntityDto cliente) {
        clienteJPA.deleteById(cliente.getId());
        ClienteEntity clienteEntity=clienteEntityMapper.mapper.toEntity(cliente);
        clienteJPA.save(clienteEntity);
    }

    @Override
    public void guardarCliente(ClienteEntityDto cliente) {
        ClienteEntity clienteEntity=clienteEntityMapper.mapper.toEntity(cliente);
        clienteJPA.save(clienteEntity);
    }

    @Override
    public void eliminarCliente(Integer id) {
        clienteJPA.deleteById(id);
    }

    @Override
    public ClienteEntityDto getClienteByUsername(String username) {
        ClienteEntity clienteEntity = clienteJPA.findByUsername(username);
        return clienteEntityMapper.mapper.toDto(clienteEntity);
    }
}

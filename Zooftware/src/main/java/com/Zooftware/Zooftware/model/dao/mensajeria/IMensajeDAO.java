package com.Zooftware.Zooftware.model.dao.mensajeria;

import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;

public interface IMensajeDAO {
    public MensajeEntityDto buscarPorId(Integer id);
    void actualizarMensaje(MensajeEntityDto mensaje);
    void guardarMensaje(MensajeEntityDto mensaje);
    public void eliminarMensaje(Integer id);
}

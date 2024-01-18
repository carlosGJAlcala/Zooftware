package com.Zooftware.Zooftware.modelDAO;

import com.Zooftware.Zooftware.modelDTO.JefeEntityDto;
import com.Zooftware.Zooftware.modelDTO.MensajeEntityDto;

public interface IMensajeDAO {
    public MensajeEntityDto buscarPorId(Integer id);
    void actualizarMensaje(MensajeEntityDto mensaje);
    void guardarMensaje(MensajeEntityDto mensaje);
    public void eliminarMensaje(Integer id);
}

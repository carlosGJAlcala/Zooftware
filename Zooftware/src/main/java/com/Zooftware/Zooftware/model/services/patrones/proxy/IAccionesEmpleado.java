package com.Zooftware.Zooftware.model.services.patrones.proxy;



import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoAnimal;
import com.Zooftware.Zooftware.model.services.patrones.adapter.BebederoJson;

import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:12
 */
public interface IAccionesEmpleado extends IAccionesCliente {

    public void enviarMensaje(MensajeEntityDto mensaje);


    public List<MensajeEntityDto> consultarMensajes(String trabjadorId);

    public EstadoAnimal ComprobarEstadoAnimal(int id);

    public void ModificarEstadoAnimal(AnimalEntityDto animal);

    public void ejercitarAnimal(int id, int cantidad);

    public void dormirAnimal(int id, int cantidad);

    public void darComerAnimal(int id, int cantidad);


    public void rellenarComederos(int habita_id);

    public void rellenarBebederos(int habita_id);

    public List<BebederoEntityDto> verBebederos(int habita_id);




    void modificarEstadoComedero(ComederoEntityDto comedero, int cantidad);

    void modificarEstadoBebedero(BebederoJson bebedero);


}
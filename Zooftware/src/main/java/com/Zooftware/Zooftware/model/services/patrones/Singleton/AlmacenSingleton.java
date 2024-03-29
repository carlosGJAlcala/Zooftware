package com.Zooftware.Zooftware.model.services.patrones.Singleton;

import com.Zooftware.Zooftware.model.dao.instalaciones.IAlmacenComidaDAO;
import com.Zooftware.Zooftware.model.dto.instalaciones.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.model.services.patrones.builder.Cocinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenSingleton {

    private Cocinero cocinero;
    private List<AlmacenComidaEntityDto> almacenesComida;

    @Autowired
    private IAlmacenComidaDAO iAlmacenComidaDAO;


    @Autowired
    public AlmacenSingleton(Cocinero cocinero, List<AlmacenComidaEntityDto> almacenesComida, IAlmacenComidaDAO iAlmacenComidaDAO) {
        this.cocinero = cocinero;
        this.almacenesComida = almacenesComida;
        this.iAlmacenComidaDAO = iAlmacenComidaDAO;
    }

    private AlmacenSingleton() {
        this.cocinero = new Cocinero();
        //this.almacenesComida = iAlmacenComidaDAO.buscarAlmacenes();
    }

    public void cargarListAlmacen() {
        if (almacenesComida == null || almacenesComida.isEmpty())
            this.almacenesComida = iAlmacenComidaDAO.buscarAlmacenes();
    }

    public Cocinero crearCocinero() {
        if (cocinero == null) {
            this.cocinero = new Cocinero();
            return this.cocinero;
        } else {
            return this.cocinero;
        }
    }

    private static AlmacenSingleton instancia;

    public static synchronized AlmacenSingleton getInstancia() {
        if (instancia == null) {// Si la instancia es null, se crea.
            instancia = new AlmacenSingleton();
        }
        return instancia;
    }

    public Cocinero getCocinero() {
        return cocinero;
    }


    public List<AlmacenComidaEntityDto> getAlmacenesComida() {
        return almacenesComida;
    }

    public void setAlmacenesComida(List<AlmacenComidaEntityDto> almacenesComida) {
        this.almacenesComida = almacenesComida;
    }

    public IAlmacenComidaDAO getiAlmacenComidaDAO() {
        return iAlmacenComidaDAO;
    }

    public void setiAlmacenComidaDAO(IAlmacenComidaDAO iAlmacenComidaDAO) {
        this.iAlmacenComidaDAO = iAlmacenComidaDAO;
    }
}

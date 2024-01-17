package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.patrones.builder.IComidaBuilder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity}
 */
public class AlmacenComidaEntityDto implements Serializable {
    private final int id;

    private IComidaBuilder comidadbuilder;



    private List<ComidaEntityDto> provisiones ;

    public AlmacenComidaEntityDto(int id) {
        this.id = id;
        provisiones=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlmacenComidaEntityDto entity = (AlmacenComidaEntityDto) o;
        return Objects.equals(this.id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ")";
    }

    /**
     * DTO for {@link com.Zooftware.Zooftware.modelJPA.AlmacenComidaEntity}
     */
    public void setProvisiones(List<ComidaEntityDto> provisiones) {
        this.provisiones = provisiones;
    }
    public ComidaEntityDto getPizza() {
        return comidadbuilder.getAlimento();
    }

    /**
     * Construye el producto Pizza paso a paso.
     */
    public void crearPizza() {
        if(comidadbuilder.abrirbolsa(provisiones)){
            comidadbuilder.mezclarTopics();
            comidadbuilder.calentarComida();
            comidadbuilder.ponerComidaEnCubo();
        }else {
            System.out.println("No quedan provisiones");

        }

    }
    public void setComidadbuilder(IComidaBuilder comidadbuilder) {
        this.comidadbuilder = comidadbuilder;
    }

}
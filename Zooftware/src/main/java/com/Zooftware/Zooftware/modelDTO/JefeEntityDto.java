package com.Zooftware.Zooftware.modelDTO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.JefeEntity}
 */
public class JefeEntityDto  extends  TrabajadorEntityDto implements Serializable {
    private final int id;

    private List<TrabajadorEntityDto> subordinados;



    public JefeEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId, double salario, String puesto, int id1) {
        super(id, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, trabajadorId, salario, puesto);
        this.id = id1;
        subordinados=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JefeEntityDto entity = (JefeEntityDto) o;
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

    @Override
    public void aniadirSubordinado(TrabajadorEntityDto t) {
        subordinados.add(t);

    }

    @Override
    public void eliminarSubordinado(TrabajadorEntityDto t) {

    }

    @Override
    public double getSalarios() {
        double sum = getSalario(); // Suma el salario de este empleado.
        for (TrabajadorEntityDto subordinado : subordinados) {
            sum += subordinado.getSalarios();// Suma el salario de su subordinado.
        }
        return sum;
    }

    @Override
    public String getDescripcion() {
        String desc = this.toString(); //Añade a la cadena el puesto de este empleado
        for (TrabajadorEntityDto subordinado : subordinados) {
            //Aniade a la cadena el puesto de su subordinado.
            desc += "\n\t### " + subordinado.getDescripcion();
        }
        return desc;
    }
}
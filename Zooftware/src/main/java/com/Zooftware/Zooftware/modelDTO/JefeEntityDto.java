package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.JefeEntity}
 */
public class JefeEntityDto  extends  TrabajadorEntityDto implements Serializable {
    private final int id3;

    private List<TrabajadorEntityDto> subordinados;

    public JefeEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId,
                         int id2, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId2, double salario, String puesto,
                         int id3) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, id2, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, trabajadorId2, salario, puesto);
        this.id3 = id3;
        subordinados=new ArrayList<>();
    }


//    public JefeEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId, double salario, String puesto, int id1) {
//        super(id, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, trabajadorId, salario, puesto);
//        this.id = id1;
//        subordinados=new ArrayList<>();
//    }

    public int getId() {
        return id3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JefeEntityDto entity = (JefeEntityDto) o;
        return Objects.equals(this.id3, entity.id3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id3);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id3 + ")";
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
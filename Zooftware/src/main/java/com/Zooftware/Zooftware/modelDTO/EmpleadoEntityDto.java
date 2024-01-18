package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * DTO for {@link com.Zooftware.Zooftware.modelJPA.EmpleadoEntity}
 */
public class EmpleadoEntityDto extends  TrabajadorEntityDto implements Serializable {
    private final int id3;

    public EmpleadoEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, Integer clienteZooId, Integer contactoId, Integer trabajadorId,
                             int id2, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId2, double salario, String puesto,
                             int id3) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, id2, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, trabajadorId2, salario, puesto);
        this.id3 = id3;
    }


//    public EmpleadoEntityDto(int id, boolean activo, Timestamp fechaFinContrato, Timestamp fechaInicioContrato, long numeroSeguridadSocial, Integer empleadoZooId, Integer jefeId, Integer trabajadorId, double salario, String puesto, int id1) {
//        super(id, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, empleadoZooId, jefeId, trabajadorId, salario, puesto);
//        this.id = id1;
//    }


    public int getId() {
        return id3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoEntityDto entity = (EmpleadoEntityDto) o;
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

    }

    @Override
    public void eliminarSubordinado(TrabajadorEntityDto t) {

    }

    @Override
    public double getSalarios() {
        return 0;
    }

    @Override
    public String getDescripcion() {
        return null;
    }
}
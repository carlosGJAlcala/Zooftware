package com.Zooftware.Zooftware.modelDTO;

import com.Zooftware.Zooftware.modelJPA.enums.Rol;
import com.Zooftware.Zooftware.modelJPA.persona.JefeEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link JefeEntity}
 */
public class JefeEntityDto  extends  TrabajadorEntityDto implements Serializable {

    private List<TrabajadorEntityDto> subordinados;

    public JefeEntityDto(int id, String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario, List<TrabajadorEntityDto> subordinados) {
        super(id, apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, jefeEntityDto, mensajes, salario);
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "JefeEntityDto{" +
                "subordinados=" + subordinados +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JefeEntityDto that = (JefeEntityDto) o;
        return Objects.equals(getSubordinados(), that.getSubordinados());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSubordinados());
    }

    public List<TrabajadorEntityDto> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(List<TrabajadorEntityDto> subordinados) {
        this.subordinados = subordinados;
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
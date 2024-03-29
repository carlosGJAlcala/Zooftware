package com.Zooftware.Zooftware.model.dto.persona;

import com.Zooftware.Zooftware.model.dto.mensajeria.MensajeEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.Rol;
import com.Zooftware.Zooftware.model.entities.persona.JefeEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link JefeEntity}
 */
public class JefeEntityDto  extends TrabajadorEntityDto implements Serializable {

    private List<TrabajadorEntityDto> subordinados;

    public JefeEntityDto(String apellidos, String dni, int edad, String nombre, String password, Rol rol, String username, ClienteEntityDto clienteZooId, ContactoEntityDto contactoId, TrabajadorEntityDto trabajadorId, boolean activo, Date fechaFinContrato, Date fechaInicioContrato, long numeroSeguridadSocial, JefeEntityDto jefeEntityDto, List<MensajeEntityDto> mensajes, double salario, List<TrabajadorEntityDto> subordinados) {
        super(apellidos, dni, edad, nombre, password, rol, username, clienteZooId, contactoId, trabajadorId, activo, fechaFinContrato, fechaInicioContrato, numeroSeguridadSocial, jefeEntityDto, mensajes, salario);
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
        return this.subordinados;
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
    public double calcularSalario() {
//        double sum = super.getSalario(); // Suma el salario de este empleado.
//
//        Optional<List<TrabajadorEntityDto>> subord = (Optional<List<TrabajadorEntityDto>>) this.subordinados;
//
//
//            if(!subordinados()){
//                for (TrabajadorEntityDto subordinado : subordinados) {
//                    sum += subordinado.calcularSalario();// Suma el salario de su subordinado.
//                }
//            }
//            return sum;

        double sum = super.getSalario(); // Suma el salario de este empleado.

        // Verifica si la lista subordinados no es null y no está vacía antes de iterar.
        if (this.subordinados != null && !this.subordinados.isEmpty()) {
            for (TrabajadorEntityDto subordinado : subordinados) {
                sum += subordinado.calcularSalario(); // Suma el salario de su subordinado.
            }
        }
        return sum;

    }


}
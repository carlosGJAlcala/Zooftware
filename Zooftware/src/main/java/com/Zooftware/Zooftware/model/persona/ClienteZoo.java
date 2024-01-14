package com.Zooftware.Zooftware.model.persona;


import com.Zooftware.Zooftware.model.interfaces.IDescripcion;
import jakarta.persistence.*;

import java.util.Date;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:03
 */
@Entity
@Table(name = "cliente")
public class ClienteZoo implements IDescripcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numVisitas;
	private Date fechaRegistro;
	private Date fechaUltimaVisita;

	public ClienteZoo(){
	}
	public void descripcion(){

	}
}//end ClienteZoo
package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.instalaciones.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.persona.interfaces.ITrabajador;
import com.Zooftware.Zooftware.model.organismos.Organismo;
import com.Zooftware.Zooftware.model.organismos.SueloImpl;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
@Entity
@Table(name = "habitat")
public class Habitat extends InstalacionAbs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany
	@JoinColumn(name = "comedero_id")
	private Comedero comedero;

	@OneToMany
	@JoinColumn(name = "bebedero_id")
	private Bebedero bebedero;

	@OneToMany
	@JoinColumn(name = "organismo_id")
	private Organismo organismos;

	@Enumerated(EnumType.STRING)
	private TipoHabitat tipoHabitat;

	@OneToOne
	@JoinColumn(name = "suelo_id")
	private SueloImpl suelo;

	public Habitat(SueloImpl suelo) {
		suelo = suelo;
	}
	public Habitat(){}

	public SueloImpl getTipoSuelo() {
		return suelo;
	}

	public void setTipoSuelo(SueloImpl tipoSuelo) {
		suelo = tipoSuelo;
	}

	@Override
	public String descripcion() {
		return null;
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion();
	}

	@Override
	public void anadirEmpleado(ITrabajador trabajador) {
		super.anadirEmpleado(trabajador);
	}
}//end HabitaAbs
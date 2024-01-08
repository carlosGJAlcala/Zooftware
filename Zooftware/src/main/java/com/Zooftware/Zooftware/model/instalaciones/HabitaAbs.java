package com.Zooftware.Zooftware.model.instalaciones;


import com.Zooftware.Zooftware.model.interfaces.IOrganismo;
import com.Zooftware.Zooftware.model.interfaces.IRecipiente;
import com.Zooftware.Zooftware.model.interfaces.ISuelo;
import com.Zooftware.Zooftware.model.organismos.OrganismoAbs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:00
 */
public abstract class HabitaAbs extends InstalacionAbs {

	private List< IRecipiente> ListaIRecipientes;
	private List<IOrganismo> ListaOrganismos;
	private ISuelo TipoSuelo;

	public HabitaAbs(ISuelo tipoSuelo) {
		TipoSuelo = tipoSuelo;
		ListaIRecipientes= new ArrayList<IRecipiente>();
		ListaOrganismos= new ArrayList<IOrganismo>();
	}

	public void anadirOrganismo(IOrganismo organismo){
		ListaOrganismos.add(organismo);
	}
	public void eliminarOrganismo(IOrganismo organismo){
		ListaOrganismos.remove(organismo);
	}
	public void anadirRecipiente(IRecipiente recipiente){
		ListaIRecipientes.add(recipiente);
	}
	public void eliminarRecipiente(IRecipiente recipiente){
		ListaIRecipientes.remove(recipiente);
	}
	public ISuelo getTipoSuelo() {
		return TipoSuelo;
	}

	public void setTipoSuelo(ISuelo tipoSuelo) {
		TipoSuelo = tipoSuelo;
	}


}//end HabitaAbs
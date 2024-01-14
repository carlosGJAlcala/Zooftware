package com.Zooftware.Zooftware.model.mensajeria;


import com.Zooftware.Zooftware.model.instalaciones.interfaces.IInstalacion;
import com.Zooftware.Zooftware.model.interfaces.ITarea;
import com.Zooftware.Zooftware.model.mensajeria.interfaces.IEstadoMensaje;
import com.Zooftware.Zooftware.model.mensajeria.interfaces.IMensaje;
import com.Zooftware.Zooftware.model.tareas.Tareas;
import jakarta.persistence.*;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:03
 */
@Entity
@Table(name = "mensaje")
public class MensajeImpl implements IMensaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Asunto;
	private String Destinario;

	//private IEstadoMensaje Estado;
	//private IInstalacion Instalacion;
	private String Remitente;
	//private ITarea Tarea;
	private String Texto;
	//public ITarea m_ITarea;

	@OneToOne
	@JoinColumn(name = "tarea_id")
	private Tareas tareas;

	public MensajeImpl(){

	}
	public void getRemitente(){

	}

	public void getTarea(){

	}

	public void setRemitente(){

	}

	public void setTarea(){

	}
}//end MensajeImpl
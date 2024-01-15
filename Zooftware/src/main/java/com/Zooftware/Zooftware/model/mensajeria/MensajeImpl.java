package com.Zooftware.Zooftware.model.mensajeria;


import com.Zooftware.Zooftware.model.mensajeria.interfaces.IMensaje;
import com.Zooftware.Zooftware.model.tareas.Tarea;
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
	private Tarea tareas;

	public MensajeImpl(int id, String asunto, String destinario, String remitente, String texto, Tarea tareas) {
		this.id = id;
		Asunto = asunto;
		Destinario = destinario;
		Remitente = remitente;
		Texto = texto;
		this.tareas = tareas;
	}

	public MensajeImpl(){

	}
	public void getRemitente(){

	}

	public void getTarea(){

	}

	public void setRemitente(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsunto() {
		return Asunto;
	}

	public void setAsunto(String asunto) {
		Asunto = asunto;
	}

	public String getDestinario() {
		return Destinario;
	}

	public void setDestinario(String destinario) {
		Destinario = destinario;
	}

	public void setRemitente(String remitente) {
		Remitente = remitente;
	}

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	}

	public Tarea getTareas() {
		return tareas;
	}

	public void setTareas(Tarea tareas) {
		this.tareas = tareas;
	}

	public void setTarea(){

	}
}//end MensajeImpl
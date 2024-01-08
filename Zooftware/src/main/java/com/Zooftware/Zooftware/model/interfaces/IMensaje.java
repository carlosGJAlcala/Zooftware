package com.Zooftware.Zooftware.model.interfaces;


import com.Zooftware.Zooftware.model.instalaciones.HabitaAbs;

/**
 * @author carlos
 * @version 1.0
 * @created 08-ene.-2024 16:50:04
 */
public interface IMensaje {

	/**
	 * @author carlos
	 * @version 1.0
	 * @created 08-ene.-2024 16:50:04
	 */
	public class Terrestre extends HabitaAbs {

		private int NumBebederos;
		private int NumComederos;

		public Terrestre(){

		}

		public void finalize() throws Throwable {
			super.finalize();
		}
	}//end Terrestre

	public void getRemitente();

	public void getTarea();

	public void setRemitente();

	public void setTarea();

}
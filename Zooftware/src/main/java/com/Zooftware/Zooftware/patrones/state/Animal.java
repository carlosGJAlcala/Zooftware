package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.Default;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;

public class Animal extends AnimalEntityDto {

    private int ident;
    private Estado estadoActual; // Estado actual


    @Default
    public Animal(int ident, String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, int numExtremidades, int salud, int sed, int suenio, int hambre) {
        super(nombre, estadoAnimal, tipo, null, numExtremidades, salud, sed, suenio, hambre);
        if(estadoAnimal==EstadoAnimal.FELIZ){
            this.estadoActual=new EstadoFeliz();
        }else {
            this.estadoActual=new EstadoTriste();
        }
        this.ident = ident;
//        this.comida = 10;
//        this.salud = 10;
//        this.suenio = 0;
    }

    public Animal(int ident, Estado estadoActual, int salud, int comida, int suenio) {
        this.ident = ident;
        this.estadoActual = estadoActual;
//        this.salud = salud;
//        this.comida = comida;
//        this.suenio = suenio;
    }


    public int getIdent() {
        return this.ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public Estado getEstadoActual() {
        return this.estadoActual;
    }

    public Animal(Estado estadoActual, int salud, int comida, int suenio) {
        this.estadoActual = estadoActual;
//        this.salud = salud;
//        this.comida = comida;
//        this.suenio = suenio;
    }

    public void resultado() {
        estadoActual.ejecutar(this); //comprobamos el estado final
    }


    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

}

package com.Zooftware.Zooftware.patrones.state;

import com.Zooftware.Zooftware.modelDTO.AnimalEntityDto;
import com.Zooftware.Zooftware.modelDTO.HabitatEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.EstadoAnimal;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAnimal;

public class Animal extends AnimalEntityDto {

    private Estado estadoActual; // Estado actual
    int salud;
    int comida;
    int suenio;
//    public Animal(String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, int id) {
//        super(nombre, estadoAnimal, tipo, id);
//        if(estadoAnimal==EstadoAnimal.FELIZ){
//            estadoActual=new EstadoFeliz();
//        }else {
//            estadoActual=new EstadoTriste();
//        }
//        comida = 50;
//        salud = 50;
//        suenio = 0;
//    }


    public Animal(String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, HabitatEntityDto habitatEntityDto, int numExtremidades, int salud, int sed, int suenio, int hambre, Estado estadoActual, int salud1, int comida, int suenio1) {
        super(nombre, estadoAnimal, tipo, habitatEntityDto, numExtremidades, salud, sed, suenio, hambre);
        this.estadoActual = estadoActual;
    public Animal(String nombre, EstadoAnimal estadoAnimal, TipoAnimal tipo, int id, int numExtremidades, int salud, int sed, int suenio, int hambre) {
        super(nombre, estadoAnimal, tipo, id,  numExtremidades, salud, sed, suenio, hambre);

        if(estadoAnimal==EstadoAnimal.FELIZ){
            this.estadoActual=new EstadoFeliz();
        }else {
            this.estadoActual=new EstadoTriste();
        }
        this.comida = 50;
        this.salud = 50;
        this.suenio = 0;
    }

    public Animal(Estado estadoActual, int salud, int comida, int suenio) {
        this.estadoActual = estadoActual;
        this.salud = salud;
        this.comida = comida;
        this.suenio = suenio;
    }
    public void darComida(int cantidad) {
        comida += cantidad;
        if (comida > 100) {
            comida = 100;
        } else if (comida < 0) {
            comida = 0;
        }
        estadoActual = new EstadoComida();
        estadoActual.ejecutar(this);
        resultado();
    }
    public void hacerEjercicio(int cantidad) {
        salud += cantidad;
        if (salud > 100) {
            salud = 100;
        } else if (salud < 0) {
            salud = 0;
        }
        estadoActual = new EstadoSalud();
        estadoActual.ejecutar(this);
        resultado();
    }
    public void dormir(int cantidad) {
        suenio -= cantidad;
        if (suenio > 100) {
            suenio = 100;
        } else if (suenio < 0) {
            suenio = 0;
        }
        estadoActual = new EstadoSuenio();
        estadoActual.ejecutar(this);
        resultado();
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getSuenio() {
        return suenio;
    }

    public void setSuenio(int suenio) {
        this.suenio = suenio;
    }

    public void resultado() {
        estadoActual.ejecutar(this); //comprobamos el estado final
    }


    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

}

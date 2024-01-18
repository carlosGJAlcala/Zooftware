package com.Zooftware.Zooftware.patrones.AbstractFactory;

import com.Zooftware.Zooftware.modelDAO.*;
import com.Zooftware.Zooftware.modelDTO.AcuaticoEntityDto;
import com.Zooftware.Zooftware.modelDTO.AlmacenComidaEntityDto;
import com.Zooftware.Zooftware.modelDTO.AnfibioEntityDto;
import com.Zooftware.Zooftware.modelDTO.TerrestreEntityDto;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class instalacionFactoryConcreta implements InstalacionFactory{

    public static  int contadorAnfibio=0;
    public static  int contadorHabita=0;
    public static  int contadorTerrestre=0;
    public static  int contadorAcuatico=0;
    @Autowired
    IAnfibioDAO habitaanfibio;
    @Autowired
    IAcuaticoDAO habitaAcuatio;
    @Autowired
    ITerrestreDAO habitaTerrestre;
    @Autowired
    IAlmacenComidaDAO almacen;

    @Autowired
    IHabitatDAO habita;



    @Override
    public AcuaticoEntityDto crerAcuarioAguaDulce() {
        do {
            contadorHabita++;
        }
        while(comprobarIdHabita(contadorHabita));
        do {
            contadorAcuatico++;
        }
        while(comprobarIdHabita(contadorAcuatico));


        AcuaticoEntityDto habita=new AcuaticoEntityDto(contadorHabita, TipoAgua.DULCE,contadorAcuatico);
        habitaAcuatio.guardarAcuario(habita);

        return habita;
    }

    @Override
    public AcuaticoEntityDto crerAcuarioAguaSalada() {
        do {
            contadorHabita++;
        }
        while(comprobarIdHabita(contadorHabita));
        do {
            contadorAcuatico++;
        }
        while(comprobarIdAcuario(contadorAcuatico));


        AcuaticoEntityDto habita=new AcuaticoEntityDto(contadorHabita, TipoAgua.SALADA,contadorAcuatico);
        habitaAcuatio.guardarAcuario(habita);
        return habita;
    }

    @Override
    public AnfibioEntityDto crearHabitaAnfibio() {
        do {
            contadorHabita++;
        }
        while(comprobarIdHabita(contadorHabita));
        do {
            contadorAnfibio++;
        }
        while(comprobarIdAnfibio(contadorAnfibio));


        AnfibioEntityDto habita=new AnfibioEntityDto(contadorHabita,2,contadorAnfibio);
        habitaanfibio.guardar(habita);
        return habita;
    }

    @Override
    public TerrestreEntityDto crearHabitaTerrestre() {
        do {
            contadorHabita++;
        }
        while(comprobarIdHabita(contadorHabita));
        do {
            contadorTerrestre++;
        }
        while(comprobarIdTerrestre(contadorTerrestre));


        TerrestreEntityDto habita=new TerrestreEntityDto(contadorHabita,2,2,contadorAnfibio);
        habitaTerrestre.guardarTerrestre(habita);
        return habita;
    }

    @Override
    public AlmacenSingleton crearAlmacen() {
        List<AlmacenComidaEntityDto> almacenes =almacen.buscarAlmacenes();
        AlmacenComidaEntityDto almacenComidaEntityDto1 = almacenes.get(0);
        AlmacenSingleton almacenSingleton=AlmacenSingleton.getInstancia();
        almacenSingleton.setProvisiones(almacenComidaEntityDto1.getProvisiones());
        return almacenSingleton;
    }
    public boolean comprobarIdHabita(int id){
        return (habita.buscarPorId(id)!=null)?true:false;
    }
    public boolean comprobarIdAcuario(int id){

        return (habitaAcuatio.buscarPorId(id)!=null)?true:false;
    }
    public boolean comprobarIdTerrestre(int id){
        return (habitaTerrestre.buscarPorId(id)!=null)?true:false;
    }
    public boolean comprobarIdAnfibio(int id){
        return (habitaanfibio.encontrarPorId(id)!=null)?true:false;
    }
}

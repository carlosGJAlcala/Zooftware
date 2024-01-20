package com.Zooftware.Zooftware.patrones.AbstractFactory;

import com.Zooftware.Zooftware.modelDAO.*;
import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.ComederoEntity;
import com.Zooftware.Zooftware.patrones.Singleton.AlmacenSingleton;
import com.Zooftware.Zooftware.patrones.factoryMethod.FactoryAnimalesConcreto;
import com.Zooftware.Zooftware.patrones.factoryMethod.FactoryMethodAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    IBebederoDAO bebederoDAO;
    @Autowired
    IComederoDAO comederoDAO;

    @Autowired
    IAnimalDAO iAnimalDAO;
    @Autowired
    IPlantaDAO iPlantaDAO;

    @Autowired
    IHabitatDAO habita;

    FactoryMethodAnimal factoryMethodAnimal=new FactoryAnimalesConcreto();
    @Autowired
    AlmacenSingleton almacenSingleton;


    @Override
    public AcuaticoEntityDto crerAcuarioAguaDulce() {


        AcuaticoEntityDto habita=new AcuaticoEntityDto(contadorHabita, TipoAgua.DULCE,contadorAcuatico);

        List<AnimalEntityDto> animales=new ArrayList<>();
        List<PlantaEntityDto> plantas=new ArrayList<>();
        animales.add(factoryMethodAnimal.crearAnimalAcuaticoAguaDulce());
        animales.add(factoryMethodAnimal.crearAnimalAcuaticoAguaDulce());
        plantas.add(factoryMethodAnimal.plantaAcuaticaAguaDulce());
        plantas.add(factoryMethodAnimal.plantaAcuaticaAguaDulce());
        habita.setAnimales(animales);
        habita.setPlantas(plantas);

        habitaAcuatio.guardarAcuario(habita);

        return habita;
    }

    @Override
    public AcuaticoEntityDto crerAcuarioAguaSalada() {


        AcuaticoEntityDto habita=new AcuaticoEntityDto(contadorHabita, TipoAgua.SALADA,contadorAcuatico);
        List<AnimalEntityDto> animales=new ArrayList<>();
        List<PlantaEntityDto> plantas=new ArrayList<>();
        animales.add(factoryMethodAnimal.crearAnimalAcuaticoAguaSalada());
        animales.add(factoryMethodAnimal.crearAnimalAcuaticoAguaSalada());
        plantas.add(factoryMethodAnimal.plantaAcuaticaAguaSalada());
        plantas.add(factoryMethodAnimal.plantaAcuaticaAguaSalada());
        habita.setAnimales(animales);
        habita.setPlantas(plantas);

        habitaAcuatio.guardarAcuario(habita);
        return habita;
    }

    @Override
    public AnfibioEntityDto crearHabitaAnfibio() {

        AnfibioEntityDto habita=new AnfibioEntityDto(contadorHabita,2,contadorAnfibio);
        List<AnimalEntityDto> animales=new ArrayList<>();
        List<PlantaEntityDto> plantas=new ArrayList<>();

        AnimalEntityDto animal1 = factoryMethodAnimal.crearAnimalAnfibio();
        animal1.setHabitatEntityDto(habita);
        animales.add(animal1);

        AnimalEntityDto animal2 = factoryMethodAnimal.crearAnimalAnfibio();
        animal1.setHabitatEntityDto(habita);
        animales.add(animal2);

        PlantaEntityDto planta1 = factoryMethodAnimal.plantaAnfibia();
        planta1.setHabitatEntityDto(habita);
        plantas.add(planta1);

        PlantaEntityDto planta2 = factoryMethodAnimal.plantaAnfibia();
        planta2.setHabitatEntityDto(habita);
        plantas.add(planta2);

        habita.setAnimales(animales);
        habita.setPlantas(plantas);

        habitaanfibio.guardar(habita);
        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);

        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);

        return habita;
    }

    @Override
    public TerrestreEntityDto crearHabitaTerrestre() {


        TerrestreEntityDto habita=new TerrestreEntityDto(TipoHabitat.TERRESTRE,2);


        List<AnimalEntityDto> animales=new ArrayList<>();
        List<PlantaEntityDto> plantas=new ArrayList<>();

        animales.add(factoryMethodAnimal.crearAnimalTerrestre());
        animales.add(factoryMethodAnimal.crearAnimalTerrestre());


        plantas.add(factoryMethodAnimal.plantaTerrestre());
        plantas.add(factoryMethodAnimal.plantaTerrestre());

        habita.setAnimales(animales);
        habita.setPlantas(plantas);

        habitaTerrestre.guardarTerrestre(habita);
        return habita;
    }

    @Override
    public AlmacenSingleton crearAlmacen() {
        List<AlmacenComidaEntityDto> almacenes =almacen.buscarAlmacenes();
        AlmacenComidaEntityDto almacenComidaEntityDto1 = almacenes.get(0);
//        //AlmacenSingleton almacenSingleton=AlmacenSingleton.getInstancia();
//        almacenSingleton.setProvisiones(almacenComidaEntityDto1.getProvisiones());
//        almacenSingleton.setAlmacenComida(almacenComidaEntityDto1);
        return almacenSingleton;
    }

@Override
    public List<BebederoEntityDto> crearBebederos(int numBebederos){
    List<BebederoEntityDto> bebederos=new ArrayList<>();

    for(int i=0;i<numBebederos;i++){
            BebederoEntityDto bebedero = new BebederoEntityDto(50);
            bebederoDAO.guardarBebedero(bebedero);
            bebederos.add(bebedero);

        }
    return bebederos;
    }
    @Override
    public List<ComederoEntityDto> crearComederos(int numComederos, TipoComida tipo){
        List<ComederoEntityDto> comederos=new ArrayList<>();
        for(int i=0;i<numComederos;i++){
            ComederoEntityDto comedero=new ComederoEntityDto(50,tipo);
            comederoDAO.guardarComedero(comedero);
            comederos.add(comedero);

        }
        return  comederos;
    }

}

package com.Zooftware.Zooftware.patrones.AbstractFactory;

import com.Zooftware.Zooftware.modelDAO.*;
import com.Zooftware.Zooftware.modelDTO.*;
import com.Zooftware.Zooftware.modelJPA.enums.TipoAgua;
import com.Zooftware.Zooftware.modelJPA.enums.TipoComida;
import com.Zooftware.Zooftware.modelJPA.enums.TipoHabitat;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AcuaticoEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.AnfibioEntity;
import com.Zooftware.Zooftware.modelJPA.instalaciones.TerrestreEntity;
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

    public instalacionFactoryConcreta() {
    }

    @Override
    public AcuaticoEntityDto crerAcuarioAguaDulce() {
        AcuaticoEntityDto habita=new AcuaticoEntityDto(TipoHabitat.ACUATICO,TipoAgua.DULCE);

        AcuaticoEntity acuatico = habitaAcuatio.guardarAcuario(habita);
        habita = habitaAcuatio.buscarPorId(acuatico.getId());


        AnimalEntityDto animal1= factoryMethodAnimal.crearAnimalAcuaticoAguaDulce();
        animal1.setHabitat(habita);
        AnimalEntityDto animal2= factoryMethodAnimal.crearAnimalAcuaticoAguaDulce();
        animal2.setHabitat(habita);

        PlantaEntityDto planta1= factoryMethodAnimal.plantaAcuaticaAguaDulce();
        planta1.setHabitatEntity(habita);
        PlantaEntityDto planta2= factoryMethodAnimal.plantaAcuaticaAguaDulce();
        planta2.setHabitatEntity(habita);
        int numComederos=2;
        AcuaticoEntityDto habita=new AcuaticoEntityDto(contadorHabita,TipoAgua.DULCE,
                numComederos);
        List<AnimalEntityDto> animales=new ArrayList<>();
        List<PlantaEntityDto> plantas=new ArrayList<>();

        AnimalEntityDto animal1 = factoryMethodAnimal.crearAnimalAcuaticoAguaDulce();
        animal1.setHabitatEntityDto(habita);
        animales.add(animal1);

        AnimalEntityDto animal2 = factoryMethodAnimal.crearAnimalAcuaticoAguaDulce();
        animal1.setHabitatEntityDto(habita);
        animales.add(animal2);

        PlantaEntityDto planta1 = factoryMethodAnimal.plantaAcuaticaAguaDulce();
        planta1.setHabitatEntityDto(habita);
        plantas.add(planta1);

        PlantaEntityDto planta2 = factoryMethodAnimal.plantaAcuaticaAguaDulce();
        planta2.setHabitatEntityDto(habita);
        plantas.add(planta2);

        List<ComederoEntityDto> comederos= this.crearComederos(numComederos,TipoComida.CARNIVORA);
        comederos.stream().forEach(comederoEntityDto -> {
            comederoEntityDto.setHabitatEntityDto(habita);
            comederoDAO.guardarComedero(comederoEntityDto);
        });

        habita.setAnimales(animales);
        habita.setPlantas(plantas);
        habita.setComederos(comederos);

        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);

        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);

        return habita;
    }

    @Override
    public AcuaticoEntityDto crerAcuarioAguaSalada() {
        AcuaticoEntityDto habita=new AcuaticoEntityDto(TipoHabitat.ACUATICO, TipoAgua.SALADA);

        //Guardamos habitat en BBDD, y lo recuperamos
        AcuaticoEntity acuatico = habitaAcuatio.guardarAcuario(habita);
        habita = habitaAcuatio.buscarPorId(acuatico.getId());

        AnimalEntityDto animal1= factoryMethodAnimal.crearAnimalAcuaticoAguaSalada();
        animal1.setHabitat(habita);
        AnimalEntityDto animal2= factoryMethodAnimal.crearAnimalAcuaticoAguaSalada();
        animal2.setHabitat(habita);

        PlantaEntityDto planta1= factoryMethodAnimal.plantaAcuaticaAguaSalada();
        planta1.setHabitatEntity(habita);
        PlantaEntityDto planta2= factoryMethodAnimal.plantaAcuaticaAguaSalada();
        planta2.setHabitatEntity(habita);
        int numComederos=2;
        AcuaticoEntityDto habita=new AcuaticoEntityDto(contadorHabita,TipoAgua.SALADA,
                numComederos);
        List<AnimalEntityDto> animales=new ArrayList<>();
        List<PlantaEntityDto> plantas=new ArrayList<>();

        AnimalEntityDto animal1 = factoryMethodAnimal.crearAnimalAcuaticoAguaSalada();
        animal1.setHabitatEntityDto(habita);
        animales.add(animal1);

        AnimalEntityDto animal2 = factoryMethodAnimal.crearAnimalAcuaticoAguaSalada();
        animal1.setHabitatEntityDto(habita);
        animales.add(animal2);

        PlantaEntityDto planta1 = factoryMethodAnimal.plantaAcuaticaAguaSalada();
        planta1.setHabitatEntityDto(habita);
        plantas.add(planta1);

        PlantaEntityDto planta2 = factoryMethodAnimal.plantaAcuaticaAguaSalada();
        planta2.setHabitatEntityDto(habita);
        plantas.add(planta2);

        List<ComederoEntityDto> comederos= this.crearComederos(numComederos,TipoComida.CARNIVORA);
        comederos.stream().forEach(comederoEntityDto -> {
            comederoEntityDto.setHabitatEntityDto(habita);
            comederoDAO.guardarComedero(comederoEntityDto);
        });

        habita.setAnimales(animales);
        habita.setPlantas(plantas);
        habita.setComederos(comederos);

        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);

        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);

        return habita;
    }

    @Override
    public AnfibioEntityDto crearHabitaAnfibio() {
        //Creacion habitat
        AnfibioEntityDto habita=new AnfibioEntityDto(TipoHabitat.ANFIBIO,3);

        //Guardamos habitat en BBDD, y lo recuperamos
        AnfibioEntity anfi = habitaanfibio.guardar(habita);
        habita = habitaanfibio.encontrarPorId(anfi.getId());

        //Creacion animales/plantas
        AnimalEntityDto animal1 = factoryMethodAnimal.crearAnimalAnfibio();
        animal1.setHabitat(habita);

        AnimalEntityDto animal2 = factoryMethodAnimal.crearAnimalAnfibio();
        animal2.setHabitat(habita);


        PlantaEntityDto planta1 = factoryMethodAnimal.plantaAnfibia();
        planta1.setHabitatEntity(habita);

        PlantaEntityDto planta2 = factoryMethodAnimal.plantaAnfibia();
        planta2.setHabitatEntity(habita);

        List<ComederoEntityDto> comederos= this.crearComederos(numComederos,TipoComida.OMNIVORA);
        comederos.stream().forEach(comederoEntityDto -> {
            comederoEntityDto.setHabitatEntityDto(habita);
            comederoDAO.guardarComedero(comederoEntityDto);
        });

        habita.setAnimales(animales);
        habita.setPlantas(plantas);
        habita.setComederos(comederos);

        //Guardamos animales/plantas en BBDD
        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);
        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);
        return habita;
    }

    @Override
    public TerrestreEntityDto crearHabitaTerrestre() {
        TerrestreEntityDto habita=new TerrestreEntityDto(TipoHabitat.TERRESTRE,3,3);

        //Guardamos habitat en BBDD, y lo recuperamos
        TerrestreEntity terrestre = habitaTerrestre.guardarTerrestre(habita);
        habita = habitaTerrestre.buscarPorId(terrestre.getId());

        //Creacion animales/plantas
        AnimalEntityDto animal1 = factoryMethodAnimal.crearAnimalTerrestre();
        animal1.setHabitat(habita);
        int numBebederos=2;
        int numComederos=2;
        TerrestreEntityDto habita=new TerrestreEntityDto(TipoHabitat.TERRESTRE,numBebederos,numComederos);

        AnimalEntityDto animal2 = factoryMethodAnimal.crearAnimalTerrestre();
        animal2.setHabitat(habita);


        PlantaEntityDto planta1 = factoryMethodAnimal.plantaTerrestre();
        planta1.setHabitatEntity(habita);

        PlantaEntityDto planta2 = factoryMethodAnimal.plantaTerrestre();
        planta2.setHabitatEntity(habita);


        //Guardamos animales/plantas en BBDD
        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);
        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);
        List<ComederoEntityDto> comederos= this.crearComederos(numComederos,TipoComida.OMNIVORA);
        comederos.stream().forEach(comederoEntityDto -> {
            comederoEntityDto.setHabitatEntityDto(habita);
            comederoDAO.guardarComedero(comederoEntityDto);
        });
/*        List<BebederoEntityDto> bebederos= this.crearBebederos(numBebederos);
        bebederos.stream().forEach(bebederoEntityDto -> {
            bebederoEntityDto.setHabitatEntityDto(habita);
            bebederoDAO.guardarBebedero(bebederoEntityDto);
        });

        habita.setBebederos(bebederos);*/
        habita.setComederos(comederos);
        habita.setAnimales(animales);
        habita.setPlantas(plantas);

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
            bebederos.add(bebedero);

        }
    return bebederos;
    }
    @Override
    public List<ComederoEntityDto> crearComederos(int numComederos, TipoComida tipo){
        List<ComederoEntityDto> comederos=new ArrayList<>();
        for(int i=0;i<numComederos;i++){
            ComederoEntityDto comedero=new ComederoEntityDto(50,tipo);

            comederos.add(comedero);

        }
        return  comederos;
    }

}

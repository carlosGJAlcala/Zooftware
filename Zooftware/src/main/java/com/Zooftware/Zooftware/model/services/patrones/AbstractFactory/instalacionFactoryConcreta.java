package com.Zooftware.Zooftware.model.services.patrones.AbstractFactory;


import com.Zooftware.Zooftware.model.dao.comida.IBebederoDAO;
import com.Zooftware.Zooftware.model.dao.comida.IComederoDAO;
import com.Zooftware.Zooftware.model.dao.comida.IComidaDAO;
import com.Zooftware.Zooftware.model.dao.instalaciones.*;
import com.Zooftware.Zooftware.model.dao.organismos.IAnimalDAO;
import com.Zooftware.Zooftware.model.dao.organismos.IPlantaDAO;
import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.ComederoEntityDto;
import com.Zooftware.Zooftware.model.dto.comida.ComidaEntityDto;
import com.Zooftware.Zooftware.model.dto.instalaciones.*;
import com.Zooftware.Zooftware.model.dto.organismo.AnimalEntityDto;
import com.Zooftware.Zooftware.model.dto.organismo.PlantaEntityDto;
import com.Zooftware.Zooftware.model.entities.enums.EstadoComida;
import com.Zooftware.Zooftware.model.entities.enums.TipoAgua;
import com.Zooftware.Zooftware.model.entities.enums.TipoComida;
import com.Zooftware.Zooftware.model.entities.enums.TipoHabitat;
import com.Zooftware.Zooftware.model.entities.instalaciones.AcuaticoEntity;
import com.Zooftware.Zooftware.model.entities.instalaciones.AlmacenComidaEntity;
import com.Zooftware.Zooftware.model.entities.instalaciones.AnfibioEntity;
import com.Zooftware.Zooftware.model.entities.instalaciones.TerrestreEntity;
import com.Zooftware.Zooftware.model.services.patrones.Singleton.AlmacenSingleton;
import com.Zooftware.Zooftware.model.services.patrones.factoryMethod.FactoryAnimalesConcreto;
import com.Zooftware.Zooftware.model.services.patrones.factoryMethod.FactoryMethodAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    IComidaDAO iComidaDAO;

    @Autowired
    IAlmacenComidaDAO iAlmacenComidaDAO;
    @Autowired
    IComederoDAO iComederoDAO;

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
    IBebederoDAO iBebederoDAO;

    @Autowired
    IHabitatDAO habita;

    FactoryMethodAnimal factoryMethodAnimal=new FactoryAnimalesConcreto();
    @Autowired
    AlmacenSingleton almacenSingleton;

    public instalacionFactoryConcreta() {
    }

    @Override
    public AcuaticoEntityDto crerAcuarioAguaDulce() {
        int numComederos=2;

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

        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);

        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);

        return habita;
    }

    @Override
    public AnfibioEntityDto crearHabitaAnfibio() {
        int numBebederos=2;
        int numComederos=2;


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

        crearComederos(numComederos,TipoComida.OMNIVORA,habita);

        //Guardamos animales/plantas en BBDD
        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);
        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);

        return habita;
    }

    @Override
    public TerrestreEntityDto crearHabitaTerrestre() {
        int numBebederos=2;
        int numComederos=2;

        TerrestreEntityDto habita=new TerrestreEntityDto(TipoHabitat.TERRESTRE,3,3);

        //Guardamos habitat en BBDD, y lo recuperamos
        TerrestreEntity terrestre = habitaTerrestre.guardarTerrestre(habita);
        habita = habitaTerrestre.buscarPorId(terrestre.getId());

        //Creacion animales/plantas
        AnimalEntityDto animal1 = factoryMethodAnimal.crearAnimalTerrestre();
        animal1.setHabitat(habita);

        AnimalEntityDto animal2 = factoryMethodAnimal.crearAnimalTerrestre();
        animal2.setHabitat(habita);


        PlantaEntityDto planta1 = factoryMethodAnimal.plantaTerrestre();
        planta1.setHabitatEntity(habita);

        PlantaEntityDto planta2 = factoryMethodAnimal.plantaTerrestre();
        planta2.setHabitatEntity(habita);


        crearBebederos(numBebederos,habita);
        crearComederos(numComederos,TipoComida.CARNIVORA,habita);

        //Guardamos animales/plantas en BBDD
        iAnimalDAO.guardarAnimal(animal1);
        iAnimalDAO.guardarAnimal(animal2);
        iPlantaDAO.guardarPlanta(planta1);
        iPlantaDAO.guardarPlanta(planta2);

        return habita;
    }

    @Override
    public void crearAlmacen() {
        AlmacenComidaEntityDto almacen = new AlmacenComidaEntityDto(0);
        AlmacenComidaEntity almacenComidaEntity = iAlmacenComidaDAO.guardar(almacen);
        almacen = iAlmacenComidaDAO.encontrarPorId(almacenComidaEntity.getId());

        //crear comida
        ComidaEntityDto comida = new ComidaEntityDto(0,"Lentejas con chorizo",10,TipoComida.OMNIVORA, EstadoComida.CRUDA,"Lenteja","Chorizo",null);
        iComidaDAO.guardarComida(comida);

        ComidaEntityDto comida2 = new ComidaEntityDto(0,"Pollo al ajillo",10,TipoComida.CARNIVORA, EstadoComida.CRUDA,"Pollo","ajo",null);
        iComidaDAO.guardarComida(comida2);



    }

    @Override
    public void crearBebederos(int numBebederos, HabitatEntityDto habitat){

        for(int i = 0; i<numBebederos; i++ ){
            BebederoEntityDto bebedero = new BebederoEntityDto(0,habitat);
            iBebederoDAO.guardarBebedero(bebedero);
        }

    }
    @Override
    public void crearComederos(int numComederos, TipoComida tipo, HabitatEntityDto habitat) {

        for (int i = 0; i < numComederos; i++) {
            ComederoEntityDto comedero = new ComederoEntityDto(0, tipo, habitat);
            iComederoDAO.guardarComedero(comedero);
        }
    }

}

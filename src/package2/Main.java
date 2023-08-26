package src.package2;

import src.builder.Empleado;
import src.factorymethod.CreadorPizza;
import src.factorymethod.CreadorPizzaHawaiana;
import src.factorymethod.Pizza;
import src.prototype.Estudiante;
import src.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
       /* Singleton singleton = Singleton.getInstance();
        Singleton.getInstance();*/

        //Empleado  empleado = Empleado.builder().nombre("Jorge").id(123).build();

        //System.out.println(empleado);

//        Estudiante estudiante = new Estudiante("Jorge",123L,8 );
//
//        Estudiante estudiante2= estudiante.clone();
//
//        System.out.println(estudiante ==estudiante2);
//
//        System.out.println("Estudiante 1:" +estudiante);
//        System.out.println("Estudiante 2"  +estudiante2);


        CreadorPizza creadorPizza = new CreadorPizzaHawaiana();

        Pizza pizza=  crearPizza(creadorPizza);
        System.out.println("Tipo de masa:"+pizza.getTipoMasa()+"Tipo de queso "+pizza.getTipoQueso()+"Otros "+pizza.getToppings()+"");





    }

    public static Pizza crearPizza(CreadorPizza creadorPizza){

        return creadorPizza.crear();

    }







}

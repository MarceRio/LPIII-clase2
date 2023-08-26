package src.package2;

import src.builder.Empleado;
import src.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
       /* Singleton singleton = Singleton.getInstance();
        Singleton.getInstance();*/

        Empleado  empleado = Empleado.builder().nombre("Jorge").id(123).build();

        System.out.println(empleado);


    }
}

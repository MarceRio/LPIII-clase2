package src.strategy;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //psvm

    private static Scanner scanner = new Scanner(System.in);

    private static final int OPCION_SALIR = 6;

    public static void main(String[] args) {

//        Map<Integer, Accion> strategy = new HashMap<>();
//
//        strategy.put(1, new AccionCrear());
//        strategy.put(2, new AccionLeer());
//        strategy.put(3, new AccionActualizar());
//        strategy.put(4, new AccionEliminar());


        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
//        do {
//            System.out.println("Ingrese una opcion: 1. Crear  2. Leer 3. Actualizar 4. Eliminar ");
//
//            opcion = scanner.nextInt();
//
//            scanner.nextLine();
//
//            strategy.get(opcion).Aplicar();
//
//            System.out.println("");
//
//
//
//        } while (opcion != 5);

        do {
            System.out.println("");
            System.out.println("Ingrese una opcion: 1. Crear  2. Leer 3. Actualizar 4. Eliminar  5.  Buscar 6.Salir");

            opcion = scanner.nextInt();

            scanner.nextLine();

            Accion accion =strategy.get(opcion);

            if (opcion == OPCION_SALIR ) {continue;}

            if (accion==null){
                System.out.println("Esta opcion no existe");
                System.out.print(" ");

            } else {

                accion.Aplicar();
            }


        } while (opcion != OPCION_SALIR);

        System.out.println("");

    }

}

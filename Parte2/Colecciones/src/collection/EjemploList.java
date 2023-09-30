package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {

    public static void main(String[] args) {
        //List<String> strings = new ArrayList<>();
        List<String> strings = new LinkedList<>();

        strings.add("Hola");

        strings.add("Bienvenido");

        System.out.println(strings);

        strings.add("Carlos");

        //System.out.println(strings);

        strings.remove("Bienvenido");

        //System.out.println(strings);

        strings.remove(" Carlos ".trim()); //elimina espacios para que coincida con el elemento

        //System.out.println(strings);

        strings.add("Bienvenido");

        strings.remove(0);

        //System.out.println(strings);

        strings.addAll(List.of("Saludo", "Despedida")); // se utiliza List.of pero los elementos no se puede modificar

        //System.out.println(strings);

        strings.add(2,"cantante");

        //System.out.println(strings);

        for(int i=0; i< strings.size();i++ ){

            System.out.println(i);

        }



        for (String string : strings){

            System.out.println(string);

        }

        System.out.println("Enhacend for");

        strings.forEach(string -> System.out.println(string));







    }
}

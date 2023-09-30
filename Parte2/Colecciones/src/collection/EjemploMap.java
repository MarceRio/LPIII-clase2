package collection;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {

    public static void main(String[] args) {

        Map <Integer, String> map= new HashMap<>();
        map.put(4,"AccionEliminar");
        map.put(2,"AccionMostrar");
        System.out.println(map);

        map.put(20,"AccionCualquiera");
        map.put(11,"AccionCualquiera4");

        System.out.println(map);

        map.get(20);

        System.out.println(map.get(20));

        map.forEach((key,value)-> System.out.println(map));






        //unreal engine







    }
}

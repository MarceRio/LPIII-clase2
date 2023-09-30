package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

    public static void main(String[] args) {
        //Set<Integer> integers= new HashSet<>();
        //Set<Integer> integers= new LinkedHashSet<>();
        Set<Integer> integers= new TreeSet<>();

        integers.add(1);
        integers.add(5);

        System.out.println(integers);

        integers.add(1); //no se repite elementos

        integers.addAll(Set.of(1,2,3,8,10,25));

        System.out.println(integers);

        integers.add(24);

        System.out.println(integers);

        integers.forEach(integer -> System.out.println(integer));











    }
}

package streams;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados= new ArrayList<>();

        empleados.add(new Empleado(1L,20, "Andres"));
        empleados.add(new Empleado(6L,18, "Fernando"));
        empleados.add(new Empleado(8L,17, "Andrey"));

        Set<String> nombres =empleados.stream()
                .map(empleado -> empleado.getNombre())
                .collect(Collectors.toSet());


        Set<Character> nombres2 =empleados.stream()
                .map(empleado -> empleado.getNombre())
                .map(nombre->nombre.charAt(0))
                .collect(Collectors.toSet());


        System.out.println(nombres);

        System.out.println(nombres2);

        Set<Integer> numero= empleados.stream()
                .map(empleado -> empleado.getEdad())
                .collect(Collectors.toSet());

        Set<Empleado> numero2 =empleados.stream()
                .filter(empleado -> empleado.getEdad()>18)
                .collect(Collectors.toSet());

        Set<Empleado> nombres3 =empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0)!='A')
                .collect(Collectors.toSet());


        Optional<Empleado> maxEdad=empleados.stream()
                        .max(Comparator.comparing(empleado -> empleado.getEdad()));

        Optional<Empleado> maxnum=empleados.stream()
                .min(Comparator.comparing(empleado -> empleado.getId()));

        Optional<Empleado> maxnom=empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getNombre().length()));


        Optional<Empleado> primerelemento=empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0)=='A')
                .findFirst();

        Optional<Empleado> elementoencontrado=empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0)=='A')
                .findAny();

        Map<Long,Empleado> mapa=empleados.stream()
                .collect(Collectors.toMap(empleado -> empleado.getId(),empleado -> empleado));

      empleados.stream()
                      .filter(empleado -> empleado.getId()<5L)
                              .forEach(empleado -> System.out.println(empleado));


      empleados.stream()
                .filter(empleado -> empleado.getId()<5L)
                .forEach(System.out::println);

        empleados.stream()
                .map(Empleado::getId)
                .forEach(System.out::println);

        Optional<Empleado> optionalEmpleado=
                Optional.of(new Empleado(5L,10,"Anna"))
                                .filter(empleado -> empleado.getEdad()>18);


        optionalEmpleado.orElse(null);

        optionalEmpleado.orElseThrow(null);

        optionalEmpleado.orElseGet(()->new Empleado(4L,25,"Santiago"));
        
        System.out.println(optionalEmpleado.isPresent());



        System.out.println();






        System.out.println(numero);

        System.out.println(numero2);

        System.out.println(empleados);

        System.out.println(nombres3);

        System.out.println(maxEdad);

        System.out.println(maxnum);

        System.out.println(maxnom);

        System.out.println(primerelemento);

        System.out.println(elementoencontrado);

        System.out.println(primerelemento);

        System.out.println(mapa);

        System.out.println(optionalEmpleado);


    }

}

package funcional;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function <Integer, String> function= (Integer integer) -> integer.toString() + " , este es el número";


         String string = function.apply(8);

         MyInterfaceFuncional<String, String,Integer> myInterfaceFuncional = (String stringParam, String stringParams) -> {

             System.out.println("Valor de entrada"+ stringParam + stringParams);


             return 50;


         };

         System.out.println(myInterfaceFuncional.aplicar("100", "200"));


        }
    }




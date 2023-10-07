package generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Creador <Carrito> creadorCarrito = new Creador<>() {
            @Override
            public Carrito crear() {
                return new Carrito();
            }
        };

        Creador <Peluche> creadorPeluche = new Creador<>() {
            @Override
            public Peluche crear() {
                return new Peluche();
            }
        };

        //Creador <String> creadorString = new Creador<String>() {
          //  @Override
            //public String crear() {
              //  return null;

        creadorPeluche.crear();
        creadorCarrito.crear();




       // Integer integer = Calculadora.suma(creadorCarrito.crear(),creadorPeluche.crear());

        //System.out.println(integer);
    };


}

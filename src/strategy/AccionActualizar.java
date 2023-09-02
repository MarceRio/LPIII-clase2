package src.strategy;

public class AccionActualizar implements Accion{
    @Override
    public void Aplicar() {

        System.out.printf("Estoy actualizando");

    }

    @Override
    public int getOpcion() {
        return 3;
    }
}

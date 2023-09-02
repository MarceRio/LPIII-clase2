package src.strategy;

public class AccionEliminar implements Accion{
    @Override
    public void Aplicar() {
        System.out.printf("Estoy eliminando");
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}

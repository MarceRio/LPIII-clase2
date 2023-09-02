package src.strategy;

import javax.sound.midi.Soundbank;

public class AccionBuscar implements Accion{
    @Override
    public void Aplicar() {

        System.out.printf("Estoy buscando");

    }

    @Override
    public int getOpcion() {
        return 5;
    }
}

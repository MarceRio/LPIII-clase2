package src.factorymethod;

public class PizzaSalami implements Pizza{
    @Override
    public String getTipoMasa() {
        return "Grueso";
    }

    @Override
    public String getTipoQueso() {
        return "Quesito";
    }

    @Override
    public String getToppings() {
        return "Salami";
    }
}

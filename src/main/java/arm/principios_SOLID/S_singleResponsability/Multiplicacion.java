package arm.principios_SOLID.S_singleResponsability;

public class Multiplicacion implements IOperar{
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }
}

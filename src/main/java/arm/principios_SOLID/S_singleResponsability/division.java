package arm.principios_SOLID.S_singleResponsability;

public class division implements IOperar{
    @Override
    public int calcular(int a, int b) {
        return a/b;
    }
}

package arm.principios_SOLID.L_liskovSustitution;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return base * 3;
    }
}

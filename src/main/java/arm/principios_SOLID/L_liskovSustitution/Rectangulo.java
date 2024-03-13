package arm.principios_SOLID.L_liskovSustitution;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (base * 2) + (altura * 2);
    }
}

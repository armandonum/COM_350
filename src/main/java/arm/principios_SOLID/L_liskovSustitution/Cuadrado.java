package arm.principios_SOLID.L_liskovSustitution;

public class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }
}

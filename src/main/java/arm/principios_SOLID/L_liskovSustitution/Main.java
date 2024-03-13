package arm.principios_SOLID.L_liskovSustitution;

public class Main {
    public static void main (String[] args){
          FiguraGeometrica cuadrado = new Cuadrado(4);
          FiguraGeometrica rectangulo = new Rectangulo(4, 5);
          FiguraGeometrica triangulo = new Triangulo(4, 5);
          FiguraGeometrica circulo=new Circulo(4);

          System.out.println("area de un cuadrado :"+cuadrado.area());
          System.out.println("perimetro de un cuadrado: "+cuadrado.perimetro());
          System.out.println("area de un rectangulo :"+rectangulo.area());
          System.out.println("perimetro de un rectangulo :"+rectangulo.perimetro());
          System.out.println("area de un trangulo :"+triangulo.area());
          System.out.println("perimetro de un triagulo :"+triangulo.perimetro());
          System.out.println("area de un circulo :"+circulo.area());
            System.out.println("perimetro de un circulo :"+circulo.perimetro());
    }
}

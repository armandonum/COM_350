package arm.principios_SOLID.S_singleResponsability;

import java.util.Scanner;

public class MultiplicacionRuner implements IEjecutar{
    Scanner sc = new Scanner(System.in);
    Multiplicacion multiplicacion=new Multiplicacion();

    @Override
    public void leer() {
        System.out.println("ingrese los datos a y b");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int resultado = multiplicacion.calcular(a, b);
        System.out.println("El resultado es: " + resultado);

    }
}

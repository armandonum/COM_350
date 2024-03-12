package arm.principios_SOLID.S_singleResponsability;

import java.util.Scanner;

public class SumaRuner implements IEjecutar {

    Scanner in = new Scanner(System.in);
    Suma suma = new Suma();
    @Override
    public void leer() {
        System.out.println("ingrese los datos a y b");
        int a=in.nextInt();
        int b= in.nextInt();
        int resultado = suma.calcular(a, b);
        System.out.println("El resultado es: " + resultado);

    }
}


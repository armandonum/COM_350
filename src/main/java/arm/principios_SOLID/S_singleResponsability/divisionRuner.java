package arm.principios_SOLID.S_singleResponsability;

import java.util.Scanner;

public class divisionRuner implements IEjecutar{
Scanner in = new Scanner(System.in);
division division = new division();
    @Override
    public void leer() {
        System.out.println("ingrese los datos a y b");
        int a=in.nextInt();
        int b= in.nextInt();
        int resultado = division.calcular(a, b);
        System.out.println("El resultado es: " + resultado);

    }
}

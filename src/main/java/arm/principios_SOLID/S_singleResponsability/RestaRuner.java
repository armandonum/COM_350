package arm.principios_SOLID.S_singleResponsability;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class RestaRuner implements IEjecutar{
Scanner in=new Scanner(System.in);
Resta resta=new Resta();
    @Override
    public void leer() {
        System.out.println("ingrese los datos a y b");
        int a=in.nextInt();
        int b= in.nextInt();
        int resultado = resta.calcular(a, b);
        System.out.println("El resultado es: " + resultado);

    }
}

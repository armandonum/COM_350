package arm.principios_SOLID.S_singleResponsability;
import java.util.Scanner;
public class Calculadora implements ICalculadora{
    @Override
    public String opcion() {
        Scanner in=new Scanner(System.in);
        System.out.println("ingrese una opcion");
        return in.nextLine();
    }
    @Override
    public void menu() {
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

    }

}

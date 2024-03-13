package arm.principios_SOLID.D_DependencyInversion;

import java.util.Scanner;

public class Menu {
Scanner in = new Scanner(System.in);
    public int menu(){
        System.out.println("Seleccione el tipo de destinatario:");
        System.out.println("1. Correo Electrónico");
        System.out.println("2. SMS");
        System.out.println("3. Mensaje de Texto");

        return in.nextInt();
    }
}

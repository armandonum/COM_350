package arm.principios_SOLID.D_DependencyInversion;

import arm.principios_SOLID.D_DependencyInversion.Notificador.Notificador;
import arm.principios_SOLID.D_DependencyInversion.destinatarios.CorreoElectronico;
import arm.principios_SOLID.D_DependencyInversion.destinatarios.MSMTexto;
import arm.principios_SOLID.D_DependencyInversion.destinatarios.SMS;
import arm.principios_SOLID.D_DependencyInversion.interfaces.IDestinatario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        int opcion=menu.menu();
        IDestinatario destinatario;
        switch (opcion) {
            case 1:
                destinatario = new CorreoElectronico();
                break;
            case 2:
                destinatario = new SMS();
                break;
            case 3:
                destinatario = new MSMTexto();
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        Notificador notificador = new Notificador(destinatario);
        System.out.println("Ingrese el mensaje a enviar:");
        String mensaje = scanner.nextLine();

        notificador.enviarMensaje(mensaje);

    }
}

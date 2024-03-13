package arm.principios_SOLID.D_DependencyInversion.destinatarios;

import arm.principios_SOLID.D_DependencyInversion.interfaces.IDestinatario;

public class SMS implements IDestinatario {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje por SMS: " + mensaje);
    }
}

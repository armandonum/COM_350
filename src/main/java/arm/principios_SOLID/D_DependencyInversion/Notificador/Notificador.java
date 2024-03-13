package arm.principios_SOLID.D_DependencyInversion.Notificador;

import arm.principios_SOLID.D_DependencyInversion.interfaces.IDestinatario;

public class Notificador {
    private IDestinatario destinatario;

    public Notificador(IDestinatario destinatario) {
        this.destinatario = destinatario;
    }

    public void enviarMensaje(String mensaje) {
        destinatario.enviarMensaje(mensaje);
    }
}

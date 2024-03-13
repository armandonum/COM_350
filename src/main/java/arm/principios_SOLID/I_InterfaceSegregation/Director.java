package arm.principios_SOLID.I_InterfaceSegregation;

public class Director implements IDirector {

        private String nombre;
        private String apellido;
        private String ci;

        public Director(String nombre, String apellido, String ci) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.ci = ci;
        }



    @Override
    public void accionDirectiva() {
        System.out.println("Acciones directivas");

    }

    @Override
    public String obtenerNombreCompleto() {
        return nombre+" "+apellido;
    }

    @Override
    public String obtenerCi() {
        return ci;
    }
}
